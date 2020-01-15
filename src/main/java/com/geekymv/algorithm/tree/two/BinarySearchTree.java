package com.geekymv.algorithm.tree.two;

/**
 * 二叉查找树(二叉搜索树、Binary Search Tree)
 * 在树中的任意一个节点，其左子树中的每个节点的值小于这个节点的值，
 * 右子树节点的值大于这个节点的值。
 *           10
 *        6     12
 *      4  7  11  13
 */
public class BinarySearchTree {

    private Node<Integer> init() {
        Node<Integer> three1 = new Node<>();
        three1.setData(4);

        Node<Integer> three2 = new Node<>();
        three2.setData(7);

        Node<Integer> three3 = new Node<>();
        three3.setData(11);

        Node<Integer> three4 = new Node<>();
        three4.setData(13);

        Node<Integer> two2 = new Node<>();
        two2.setData(12);
        two2.setLeft(three3);
        two2.setRight(three4);

        Node<Integer> two1 = new Node<>();
        two1.setData(6);
        two1.setLeft(three1);
        two1.setRight(three2);

        Node<Integer> one = new Node<>();
        one.setData(10);
        one.setLeft(two1);
        one.setRight(two2);

        return one;
    }


    /**
     * 查找
     * @param root
     * @param value
     * @return
     */
    public Node<Integer> find(Node<Integer> root, int value) {
        if(root == null) {
            return root;
        }
        Integer data = root.getData();
        if(data > value) {
            return find(root.getLeft(), value);
        }else if(data < value) {
            return find(root.getRight(), value);
        }
        return root;
    }

    /**
     * 插入
     * @param root
     * @param value
     * @return
     */
    public Node<Integer> insert(Node<Integer> root, int value) {
        Integer data = root.getData();
        if(data < value) {
            if(root.getRight() == null) {
                Node<Integer> node = new Node<>();
                node.setData(value);
                root.setRight(node);
                return node;
            }
            return insert(root.getRight(), value);
        }

        if(root.getLeft() == null) {
            Node<Integer> node = new Node<>();
            node.setData(value);
            root.setLeft(node);
            return node;
        }

        return insert(root.getLeft(), value);
    }

    /**
     * 删除
     * @return
     */
    public Node<Integer> delete() {
        return null;
    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> root = binarySearchTree.init();

        Node<Integer> node = binarySearchTree.find(root, 6);
        System.out.println("find = " + node);

        node = binarySearchTree.insert(root, 3);
        System.out.println(node.getData());

    }


}
