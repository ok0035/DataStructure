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
