package org.example.stack

class StackNode(private val item: Int, private var next: StackNode?) {

    private var last: StackNode? = null

    fun push(item: Int) {
        this.last = StackNode(item, last)
    }

    fun pop(): Int? {
        val item = last?.item
        last = last?.next
        return item
    }
}