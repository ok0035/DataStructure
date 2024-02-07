# DataStructure
자료구조 공부용 레포지토리

## Stack
Mutable List를 사용해서 간단하게 만든 Stack

```
    val stack = Stack<String>()
    stack.add("1")
    stack.add("2")
    stack.add("3")
    stack.add("4")
    stack.pop()
```

## Queue
Mutable List를 사용해서 간단하게 만든 Queue

```
    val queue = Queue<String>()
    queue.enqueue("1")
    queue.enqueue("2")
    queue.enqueue("3")
    queue.enqueue("4")
    queue.dequeue()
```

## Binary search tree

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
