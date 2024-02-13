package org.example.sort

class Sort<T : Comparable<T>> {

    /*
    ex.       1, 2, 3, 4, 5, 6, 7, 8, 9
    result -> 9, 8, 7, 6, 5, 4, 3, 2, 1

    i -> 10 -> 0
    j -> 0 < i-1

    comp -> j, j+1

    오름차
    내림차

     */

    fun bubbleSort(list: List<T>, isAscendingSort: Boolean = true): MutableList<T> {
        val sortedList: MutableList<T> = list.toMutableList()
        for (i in list.lastIndex downTo 0) {
            for (j in 0 until i) {
                val firstVal = sortedList[j]
                val secondVal = sortedList[j + 1]
                when (isAscendingSort) {

                    true -> {
                        //ascending sort
                        if (secondVal < firstVal) {
                            sortedList[j] = secondVal
                            sortedList[j + 1] = firstVal
                        }
                    }

                    false -> {
                        //descending sort
                        if (secondVal > firstVal) {
                            sortedList[j] = secondVal
                            sortedList[j + 1] = firstVal
                        }
                    }

                }

            }

        }
        if (isAscendingSort)
            println("오름차순 ${sortedList.distinct().filterIndexed { index, _ -> index < 10 }}...${sortedList.last()}")
        else
            println("내림차순 ${sortedList.distinct().filterIndexed { index, _ -> index < 10 }}...${sortedList.last()}")

        return sortedList
    }

    fun selectionSort(list: List<T>, isAscendingSort: Boolean = true): MutableList<T> {
        val sortedList: MutableList<T> = list.toMutableList()
        for (i in list.indices) {
            var sortedValue = sortedList[i]
            var sortedIndex = i
            for (j in i + 1 until list.size) {
                val comparedVal = sortedList[j]
                when (isAscendingSort) {

                    true -> {
                        //ascending sort
                        if (comparedVal < sortedValue) {
                            sortedIndex = j
                        }
                    }

                    false -> {
                        //descending sort
                        if (comparedVal > sortedValue) {
                            sortedIndex = j
                        }
                    }

                }

            }
            val firstValue = sortedList[i]
            sortedList[i] = sortedList[sortedIndex]
            sortedList[sortedIndex] = firstValue

        }
        if (isAscendingSort)
            println("오름차순 ${sortedList.distinct().filterIndexed { index, _ -> index < 10 }}...${sortedList.last()}")
        else
            println("내림차순 ${sortedList.distinct().filterIndexed { index, _ -> index < 10 }}...${sortedList.last()}")

        return sortedList
    }

    fun insertSort(list: List<T>, isAscendingSort: Boolean = true): MutableList<T> {
        val sortedList: MutableList<T> = list.toMutableList()
        val size = sortedList.size
        if (sortedList.isEmpty()) return sortedList

        /*
        * j(i-1) < key index
        * */

        for (i in 1 until size) {
            val key = sortedList[i]
            var j = i - 1
            for (k in i - 1 downTo 0) {
                when (isAscendingSort) {
                    true -> {
                        if (sortedList[k] > key) {
                            sortedList[k + 1] = sortedList[k]
                            j = k
                        } else break
                    }

                    false -> {
                        if (sortedList[k] < key) {
                            sortedList[k + 1] = sortedList[k]
                            j = k
                        } else break
                    }
                }
            }
            sortedList[j] = key
        }

        if (isAscendingSort)
            println("오름차순 ${sortedList.filterIndexed { index, _ -> index < 10 }}...${sortedList.last()}")
        else
            println("내림차순 ${sortedList.filterIndexed { index, _ -> index < 10 }}...${sortedList.last()}")

        return sortedList
    }

    fun mergeSort(list: List<T>): List<T> {

        if (list.size < 2) return list

        val sortedList = list.toMutableList()
        val mid = sortedList.size / 2

        val lowList = mergeSort(sortedList.subList(0, mid))
        val highList = mergeSort(sortedList.subList(mid, sortedList.size))

        var l = 0
        var h = 0

        val mergedList = mutableListOf<T>()
        while (l < lowList.size && h < highList.size) {
            if (lowList[l] < highList[h]) {
                mergedList.add(lowList[l])
                l += 1
            } else {
                mergedList.add(highList[h])
                h += 1
            }
        }

        mergedList.addAll(lowList.subList(l, lowList.size))
        mergedList.addAll(highList.subList(h, highList.size))

        return mergedList.toList()
    }

    private fun medianOfThree(list: MutableList<T>, low: Int, mid: Int, high: Int): T {
        if (list[mid] < list[low]) list[mid] = list[low].also { list[low] = list[mid] }
        if (list[low] > list[high]) list[high] = list[low].also { list[low] = list[high] }
        if (list[mid] > list[high]) list[high] = list[mid].also { list[mid] = list[high] }
        return list[mid]
    }

    private fun partition(list: MutableList<T>, low: Int, high: Int, isAscendingSort: Boolean = true): Int {
        // median-of-three 피벗 선택
        val mid = low + (high - low) / 2
        val pivot = medianOfThree(list, low, mid, high)
        list[high] = list[mid].also { list[mid] = list[high] } // 피벗을 마지막으로 이동

        var i = low - 1
        for (j in low until high) {

            when(isAscendingSort) {
                true -> {
                    if (list[j] <= pivot) {
                        i++
                        list[i] = list[j].also { list[j] = list[i] }
                    }
                }

                false -> {
                    if (list[j] >= pivot) {
                        i++
                        list[i] = list[j].also { list[j] = list[i] }
                    }
                }
            }

        }
        list[i + 1] = list[high].also { list[high] = list[i + 1] }
        return i + 1
    }

    fun quickSort(list: MutableList<T>, low: Int, high: Int, isAscendingSort: Boolean = true) {
        if (low < high) {
            val pi = partition(list, low, high, isAscendingSort)
            quickSort(list, low, pi - 1, isAscendingSort)
            quickSort(list, pi + 1, high, isAscendingSort)
        }
    }

}
