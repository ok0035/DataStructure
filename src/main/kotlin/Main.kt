package org.example

import org.example.bst.BinarySearchTree

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("===Stack===")
    val stack = Stack<String>()
    stack.add("1")
    stack.add("2")
    stack.add("3")
    stack.add("4")
    stack.pop()

    println("\n===Queue===")
    val queue = Queue<String>()
    queue.enqueue("1")
    queue.enqueue("2")
    queue.enqueue("3")
    queue.enqueue("4")
    queue.dequeue()

    println("\n===Binary Search Tree===")
    val bst = BinarySearchTree<Int>()

    bst.insert(5)
    bst.insert(2)
    bst.insert(8)
    bst.insert(6)
    bst.insert(3)

    println("BST contains 6: ${bst.contains(6)}")
    println("BST contains 1: ${bst.contains(1)}")

    println("Inorder Traversal of BST:")
    bst.inorderTraversal()

}