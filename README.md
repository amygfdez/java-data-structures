# Java Data Structures

Java programs I wrote for the Data Structures and Algorithms course in my B.S. in Computer Science at Florida International University (Fall 2023).

| Folder | What it does |
|---|---|
| `01-sorting` | Insertion sort on an array of random numbers, plus a method that merges two sorted arrays |
| `02-binary-search-tree` | Binary search tree with insert, search, minimum, in-order, pre-order and post-order traversal, height, node count, and a count of how many times a value appears |
| `03-heap` | Array-based min-heap with `add`, `min` and `removeMin` |
| `04-hashing` | String hash function (polynomial hashing, base 37) for a hash table of a given size |
| `05-graph` | Undirected graph stored as an adjacency matrix, with add/remove edge and adjacent-vertex lookup |

## Run a program

Each folder is a separate program with its own `Main` class:

```bash
cd 02-binary-search-tree
javac *.java
java Main
```

## Notes

- The `BinarySearchTree` and `Node` classes started from starter code provided by the course instructor. The pre-order and post-order traversals, `toString`, height, node count and value count methods were added for the assignment.
- Small fixes were made in 2026 so every program compiles and runs: a typo in `getCount`, a misplaced import in the graph program, a short demo in the graph program's `main`, and spacing in the tree traversal output.
