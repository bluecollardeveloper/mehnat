Understanding differnt Concepts
* [BigO](https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/)
  * Big O defines the runtime required to execute an algorithm by identifying how the performance of your algorithm will change as the input size grows. But it does not tell you how fast your algorithm's runtime is.
```
An algorithm's time complexity specifies how long it will take to execute an algorithm as a function of its input size. 
Similarly, an algorithm's space complexity specifies the total amount of space or memory required to execute an algorithm as a function of the size of the input.
```

### Differnt types:
* O(1) - Excellent/Best
    When your calculation is not dependent on the input size, it is a constant time complexity (O(1)).
* O(log n) - Good
    When the input size is reduced by half, maybe when iterating, handling recursion, or whatsoever, it is a logarithmic time complexity (O(log n)).
* O(n) - Fair
    When you have a single loop within your algorithm, it is linear time complexity (O(n)).
* O(n log n) - Bad
    When you have nested loops within your algorithm, meaning a loop in a loop, it is quadratic time complexity (O(n^2)).
* O(n^2), O(2^n) and O(n!) - Horrible/Worst
    O(n^2) When you perform nested iteration, meaning having a loop in a loop, the time complexity is quadratic, which is horrible.

    When the growth rate doubles with each addition to the input, it is exponential time complexity (O2^n).

    You get exponential time complexity when the growth rate doubles with each addition to the input (n), often iterating through all subsets of the input elements. Any time an input unit increases by 1, the number of operations executed is doubled.