package org.example.dfs

import java.util.ArrayDeque
import java.util.ArrayList
import java.util.Deque
import java.util.LinkedList

fun main() {
    MyDFS()
}

class MyDFS {

    private val graph = mutableMapOf<Int, List<Int>>()

    init {
        graph[1] = listOf(2, 3, 4)
        graph[2] = listOf(5)
        graph[3] = listOf(5)
        graph[4] = listOf()
        graph[5] = listOf(6, 7)
        graph[6] = listOf()
        graph[7] = listOf(3)

        val r = mutableListOf<Int>()
        println(recursiveDFS(1, r))
        println(iterativeDFS(1))

    }

    fun recursiveDFS(v: Int, discovered: MutableList<Int>) : MutableList<Int> {
        var discover = discovered
        discover.add(v)
        for(w in graph[v] ?: listOf()) {
            if(!discovered.contains(w)) {
                discover = recursiveDFS(w, discover)
            }
        }
        return discover
    }

    fun iterativeDFS(v: Int): List<Int> {
        val discovered = mutableListOf<Int>()
        val stack: Deque<Int> = ArrayDeque()
        var value = v

        stack.push(value)

        while(!stack.isEmpty()) {
            value = stack.pop()
            if(!discovered.contains(value)) {
                discovered.add(value)

                for (w in graph[value] ?: listOf()) {
                    stack.push(w)
                }
            }

        }

        return discovered.toList()
    }

}