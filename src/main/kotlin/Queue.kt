package org.example

class Queue<T> {

    private val list: MutableList<T> = mutableListOf()

    fun enqueue(element: T) {
        list.add(element)
        println("ENQUEUE -> $list")
    }

    fun dequeue(): T? {
        if(list.isEmpty())
            return null

        val popElement = list.first()
        list.removeFirst()
        println("DEQUEUE -> $list")
        return popElement
    }

    fun peek(): T? {
        if(list.isEmpty()) return null
        println("PEAK -> $list")
        return list.first()
    }

    fun isEmpty(): Boolean = list.isEmpty()

}