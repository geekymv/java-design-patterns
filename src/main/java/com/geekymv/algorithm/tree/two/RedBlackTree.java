package com.geekymv.algorithm.tree.two;

/**
 * 平衡二叉查找树
 * 红黑树：树中的节点一类被标记为黑色，一类被标记为红色。
 * 满足：
 * 根节点是黑色的。
 * 每个叶子节点都是黑色的空节点(NIL)，即叶子节点不存储数据。
 * 任何相邻的节点都不能同时为红色，即红色节点是被黑色节点隔开的。
 * 每个节点，从该节点到达其可达叶子节点的所有路径都包含相同数目的黑色节点。
 *
 * 红黑树是一种平衡二叉查找树，它是为了解决普通二叉查找树在数据更新的过程中，复杂度退化问题而产生的。
 * 红黑树的高度近似log2N，它是近似平衡。
 * 插入、删除、查找操作的时间复杂度都是O(logN)
 */
public class RedBlackTree {


}