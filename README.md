# Java Data Structures & Algorithmic Solutions

A collection of core data structure implementations and algorithmic problem-solving in **Java**, focusing on efficient stack/queue manipulation, computational geometry, and two-pointer array algorithms.

---

## Components & Algorithms

* **`Ex2.java`**: Core algorithmic implementations:
  * **Card Simulation (1.a & 1.b)**: Simulating card layout distribution and reconstruction using `Queue` and `Stack` data structures.
  * **Stack & Queue Analytics (2.a & 2.b)**: Finding maximum elements in a `Stack` without losing internal state, and calculating maximum adjacent sums in an `ArrayBlockingQueue`.
  * **Maxima of Points (3)**: Computational geometry algorithm to extract Pareto-optimal (maximal) points from a 2D coordinate set.
  * **Two-Pointer Array Search (4)**: Efficient $O(n)$ linear scan to find element pairs matching a target sum across sorted arrays.
* **`Point.java`**: A geometric entity model supporting 2D coordinates, copy constructors, distance metrics (`getRadius`), and string formatting.

---

## Usage

You can compile and run the classes within an IDE or via command line:
```bash
javac Ex2/Point.java Ex2/Ex2.java
