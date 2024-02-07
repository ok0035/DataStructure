package org.example

class Stack<T> {

    private val list: MutableList<T> = mutableListOf()

    fun add(element: T) {
        list.add(element)
        println("ADD -> $list")
    }

    fun pop(): T? {
        if(list.isEmpty())
            return null

        val popElement = list.last()
        list.removeLast()
        println("POP -> $list")
        return popElement
    }

    fun peek(): T? {
        if(list.isEmpty()) return null
        println("PEAK -> $list")
        return list.last()
    }

    fun isEmpty(): Boolean = list.isEmpty()

}