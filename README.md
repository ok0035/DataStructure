# DataStructure
자료구조 공부용 레포지토리

## Stack
Mutable List를 사용해서 간단하게 만든 Stack

**Example**

CODE
```
    val stack = Stack<String>()
    stack.add("1")
    stack.add("2")
    stack.add("3")
    stack.add("4")
    stack.pop()
```

LOG
```
    ===Stack===
    ADD -> [1]
    ADD -> [1, 2]
    ADD -> [1, 2, 3]
    ADD -> [1, 2, 3, 4]
    POP -> [1, 2, 3]
```

## Queue
Mutable List를 사용해서 간단하게 만든 Queue

**Example**

CODE
```
    val queue = Queue<String>()
    queue.enqueue("1")
    queue.enqueue("2")
    queue.enqueue("3")
    queue.enqueue("4")
    queue.dequeue()
```

LOG

```
    ===Queue===
    ENQUEUE -> [1]
    ENQUEUE -> [1, 2]
    ENQUEUE -> [1, 2, 3]
    ENQUEUE -> [1, 2, 3, 4]
    DEQUEUE -> [2, 3, 4]
```

## Binary search tree

**Example**

CODE
```
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
```

LOG
```
    ===Binary Search Tree===
    BST contains 6: true
    BST contains 1: false
    Inorder Traversal of BST:
    2 3 5 6 8 
```

## Sort

**Example**

CODE
```
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
    val mergeEndTime = System.currentTimeMillis()
    println("end time -> $insertEndTime")
    println("total time -> ${mergeEndTime - mergeStartTime} mils")

    println("\n===Quick Sort===")
    println("unsorted list -> ${unsortedList.filterIndexed { index, _ -> index < 15 } }}... [${unsortedList.last()}]")
    val quickStartTime = System.currentTimeMillis()
    val quickSortedList = unsortedList.toMutableList()
    println("start time -> $quickStartTime")
    sort.quickSort(quickSortedList, 0, unsortedList.lastIndex, false)
    val quickEndTime = System.currentTimeMillis()
    println(quickSortedList)
    println("end time -> $quickEndTime")
    println("total time -> ${quickEndTime - quickStartTime} mils")
```

LOG
```
    ===Bubble Sort===
    unsorted list -> [-3197, 4621, -3552, -6814, -137, 349, 6239, -9479, -4683, 9051, 8698, -352, -2162, -6173, 3597]}... [-3635]
    start time -> 1707815028342
    오름차순 [-9999, -9996, -9990, -9988, -9987, -9986, -9985, -9984, -9981, -9980]...9996
    내림차순 [9996, 9993, 9992, 9987, 9985, 9984, 9982, 9976, 9975, 9972]...-9999
    end time -> 1707815028900
    total time -> 558 mils
    
    ===Selection Sort===
    unsorted list -> [-3197, 4621, -3552, -6814, -137, 349, 6239, -9479, -4683, 9051, 8698, -352, -2162, -6173, 3597]}... [-3635]
    start time -> 1707815028901
    오름차순 [-3635, -3197, -4817, -7688, -3552, -137, 4621, -9990, -6475, 6239]...9996
    내림차순 [6856, 8534, -3197, -3635, 1566, 4621, 9261, -6814, -3552, 9297]...-9999
    end time -> 1707815029261
    total time -> 360 mils
    
    ===Insert Sort===
    unsorted list -> [-3197, 4621, -3552, -6814, -137, 349, 6239, -9479, -4683, 9051, 8698, -352, -2162, -6173, 3597]}... [-3635]
    start time -> 1707815029262
    오름차순 [-9999, -9996, -9990, -9988, -9987, -9986, -9985, -9984, -9981, -9981]...9996
    내림차순 [9996, 9993, 9992, 9987, 9985, 9984, 9982, 9976, 9976, 9975]...-9999
    end time -> 1707815029456
    total time -> 194 mils
    
    ===Merge Sort===
    unsorted list -> [-3197, 4621, -3552, -6814, -137, 349, 6239, -9479, -4683, 9051, 8698, -352, -2162, -6173, 3597]}... [-3635]
    start time -> 1707815029457
    [-9999, -9996, -9990, -9988, -9987, -9986, -9985, -9984, -9981, -9981, -9980, -9979, -9979, -9978, -9975, -9974, -9971, ...]
    end time -> 1707815029456
    total time -> 14 mils
    
    ===Quick Sort===
    unsorted list -> [-3197, 4621, -3552, -6814, -137, 349, 6239, -9479, -4683, 9051, 8698, -352, -2162, -6173, 3597]}... [-3635]
    start time -> 1707815029473
    [9996, 9993, 9992, 9987, 9985, 9984, 9982, 9976, 9976, 9975, 9972, 9968, 9967, 9964, 9964, 9964, 9962, 9961, 9959, 9956, ...]
    end time -> 1707815029478
    total time -> 5 mils
```
