package org.example

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

    println("===Queue===")
    val queue = Queue<String>()
    queue.enqueue("1")
    queue.enqueue("2")
    queue.enqueue("3")
    queue.enqueue("4")
    queue.dequeue()

}