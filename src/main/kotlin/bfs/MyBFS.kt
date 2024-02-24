package org.example.bfs

import java.util.*

fun main() {
    MyBFS().iterativeBFS(1)
}

class MyBFS {
    private val graph = mutableMapOf<Int, List<Int>>()

    init {
        graph[1] = listOf(2, 3, 4)
        graph[2] = listOf(5)
        graph[3] = listOf(5)
        graph[4] = listOf()
        graph[5] = listOf(6, 7)
        graph[6] = listOf()
        graph[7] = listOf(3)

        println(iterativeBFS(1))

    }

    fun iterativeBFS(startV: Int): List<Int> {

        val discovered = mutableListOf<Int>()
        discovered.add(startV)

        val queue: Queue<Int> = LinkedList()
        queue.add(startV)

        while(!queue.isEmpty()) {
            val v = queue.poll()
            for(w in graph[v] ?: listOf()) {
                if(!discovered.contains(w)) {
                    discovered.add(w)
                    queue.add(w)
                }
            }
        }

        return discovered.toList()
    }


}