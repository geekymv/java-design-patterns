package com.geekymv.algorithm.tree.two;

/**
 *          1
 *      2       3
 *  4
 *
 *  二叉树的遍历方法
 *  前序遍历、中序遍历、后序遍历
 *  表示节点与它的左右子节点遍历打印的先后顺序
 */
public class BinaryTreeOrder {

    private Node<Integer> init() {
        Node<Integer> three1 = new Node<>();
        three1.setData(4);

        Node<Integer> two2 = new Node<>();
        two2.setData(3);

        Node<Integer> two1 = new Node<>();
        two1.setData(2);
        two1.setLeft(three1);

        Node<Integer> one = new Node<>();
        one.setData(1);
        one.setLeft(two1);
        one.setRight(two2);

        return one;
    }

    /**
     * 前序遍历
     * @param root
     */
    public void printPreOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.getData());
        printPreOrder(root.getLeft());
        printPreOrder(root.getRight());
    }


    /**
     * 中序遍历
     * @param root
     */
    public void printInOrder(Node root) {
        if(root == null) {
            return;
        }
        printInOrder(root.getLeft());
        System.out.println(root.getData());
        printInOrder(root.getRight());
    }

    /**
     * 后序遍历
     * @param root
     */
    public void printPostOrder(Node root) {
        if(root == null) {
            return;
        }
        printPostOrder(root.getLeft());
        printPostOrder(root.getRight());
        System.out.println(root.getData());
    }

    public static void main(String[] args) {
        BinaryTreeOrder preOrder = new BinaryTreeOrder();
        Node<Integer> root = preOrder.init();

        System.out.println("前序遍历");
        preOrder.printPreOrder(root);

        System.out.println("中序遍历");
        preOrder.printInOrder(root);

        System.out.println("后序遍历");
        preOrder.printPostOrder(root);
    }
}
