package org.example.bst

class BinarySearchTree<T : Comparable<T>> {
    private var root: TreeNode<T>? = null

    fun insert(value: T) {
        root = insertRec(root, value)
    }

    private fun insertRec(current: TreeNode<T>?, value: T): TreeNode<T> {
        if (current == null) {
            return TreeNode(value)
        }

        if (value < current.value) {
            current.left = insertRec(current.left, value)
        } else if (value > current.value) {
            current.right = insertRec(current.right, value)
        }

        return current
    }

    fun contains(value: T): Boolean {
        return searchRec(root, value) != null
    }

    private fun searchRec(current: TreeNode<T>?, value: T): TreeNode<T>? {
        if (current == null || current.value == value) {
            return current
        }

        return if (value < current.value) {
            searchRec(current.left, value)
        } else {
            searchRec(current.right, value)
        }
    }

    // 이진 탐색 트리의 요소를 순회하는 메소드들 (예: 중위 순회)
    fun inorderTraversal() = inorderRec(root)

    private fun inorderRec(node: TreeNode<T>?) {
        if (node != null) {
            inorderRec(node.left)
            print("${node.value} ")
            inorderRec(node.right)
        }
    }
}