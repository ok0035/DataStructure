package org.example

import org.example.bst.BinarySearchTree
import org.example.sort.Sort
import kotlin.random.Random

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

    println("\n===Bubble Sort===")
    val unsortedList = mutableListOf<Int>()
    val random = Random(System.currentTimeMillis())
    val sort = Sort<Int>()
    for(i in 0..10000) {
        unsortedList.add(random.nextInt() % 10000)
    }
    println("unsorted list -> ${unsortedList.filterIndexed { index, _ -> index < 15 } }}... [${unsortedList.last()}]")
    val bubbleStartTime = System.currentTimeMillis()
    println("start time -> $bubbleStartTime")
    sort.bubbleSort(unsortedList, isAscendingSort = true)
    sort.bubbleSort(unsortedList, isAscendingSort = false)
    val bubbleEndTime = System.currentTimeMillis()
    println("end time -> $bubbleEndTime")
    println("total time -> ${bubbleEndTime - bubbleStartTime} mils")

    println("\n===Selection Sort===")
    println("unsorted list -> ${unsortedList.filterIndexed { index, _ -> index < 15 } }}... [${unsortedList.last()}]")
    val selectionStartTime = System.currentTimeMillis()
    println("start time -> $selectionStartTime")
    sort.selectionSort(unsortedList, isAscendingSort = true)
    sort.selectionSort(unsortedList, isAscendingSort = false)
    val selectionEndTime = System.currentTimeMillis()
    println("end time -> $selectionEndTime")
    println("total time -> ${selectionEndTime - selectionStartTime} mils")

    println("\n===Insert Sort===")
    println("unsorted list -> ${unsortedList.filterIndexed { index, _ -> index < 15 } }}... [${unsortedList.last()}]")
    val insertStartTime = System.currentTimeMillis()
    println("start time -> $insertStartTime")
    sort.insertSort(unsortedList, isAscendingSort = true)
    sort.insertSort(unsortedList, isAscendingSort = false)
    val insertEndTime = System.currentTimeMillis()
    println("end time -> $insertEndTime")
    println("total time -> ${insertEndTime - insertStartTime} mils")

    println("\n===Merge Sort===")
    println("unsorted list -> ${unsortedList.filterIndexed { index, _ -> index < 15 } }}... [${unsortedList.last()}]")
    val mergeStartTime = System.currentTimeMillis()
    println("start time -> $mergeStartTime")
    val result = sort.mergeSort(unsortedList)
    println(result)
//    sort.mergeSort(unsortedList, isAscendingSort = true)
//    sort.mergeSort(unsortedList, isAscendingSort = false)
    val mergeEndTime = System.currentTimeMillis()
    println("end time -> $insertEndTime")
    println("total time -> ${mergeEndTime - mergeStartTime} mils")

    println("\n===Quick Sort===")
    println("unsorted list -> ${unsortedList.filterIndexed { index, _ -> index < 15 } }}... [${unsortedList.last()}]")
    val quickStartTime = System.currentTimeMillis()
    val quickSortedList = unsortedList.toMutableList()
    println("start time -> $quickStartTime")
    sort.quickSort(quickSortedList, 0, unsortedList.lastIndex, false)
//    sort.mergeSort(unsortedList, isAscendingSort = true)
//    sort.mergeSort(unsortedList, isAscendingSort = false)
    val quickEndTime = System.currentTimeMillis()
    println(quickSortedList)
    println("end time -> $quickEndTime")
    println("total time -> ${quickEndTime - quickStartTime} mils")

}