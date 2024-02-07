package org.example.bst

class TreeNode<T: Comparable<T>>(var value: T) {
    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null
}