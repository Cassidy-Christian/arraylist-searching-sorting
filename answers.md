
Search answers: 
a c n t t u v x
1. For regular search, I used MnMs, it goes space by space numerically. It could take one step to find it or N steps to find it depending on how many mnms are there. You would then return that index. If the object isn't there, then the search would have to go through the entire length. 

normal search (there): on average, length/ 2 steps
normal search (missing): length
could go 2^19

For binary search, it starts in the middle of the array. 

search(list, t)
to find t, took one step. 

to find c, took 2 steps
to find a, took 3 steps
to find b, took 4 steps 
---- around log(2) to find the right index/letter 


2.What does it mean for an algorithm to be efficient? Which algorithm, search or binary search is more efficient? Why?
When I think of efficiency I think about how many steps the program needs to take in order to find/solve for the correct solution. The fewer the steps the program has to take to get to the answer, the better! The binary search method si the most efficient. It can check multiple indexes at once compared to just one with the basic search method. This comes in handy when the list is very long. 

3. For the list: ["apple", "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"]

Describe, step by step, how each searching algorithm would process the list when searching for "blueberry"
    The basic search algorithm would go through every index one by one and once it reached the final index and still hadn't found "blueberry," it would return -1. 
["//no//apple", "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"]
["//no//apple", "//no//banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"]
["//no//apple", "//no//banana", "//no//banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"]
    and the pattern would continue like this until the end. 

    The binary search engine would start in the middle and continue crossing out the middle value until it has seen every index and will eventually return -1

    ["apple", "banana", "banana", "cherry", "lemon", "//no//lime", "mango", "orange", "pear", "strawberry", "watermelon"]
    ["apple", "banana", "//no//banana", "cherry", "lemon", "//no//lime", "mango", "orange", "//no///pear", "strawberry", "watermelon"]
    ["apple", "//no//banana", "//no//banana", "cherry", "//no//lemon", "//no//lime", "mango", "orange", "//no///pear", "strawberry", "//no//watermelon"]
    and the pattern would continue like this until the end.


How many members of the list did search access (look at) when looking for blueberry? How many members did binarySearch access?
the search an only look at one whereas binary can look at up to 4. 

If the list of fruits had been 1000 items long instead, how would your answer to question ii change?
the basic search method would still only be able to do one index at a time. I think if there were 1000 items, the binary algorithm could eventually check 300 at a time. 

Sorting Questions 

Find a deck of cards, some jellybeans, or any group of physical objects around your home that can be assigned an order. You need about 8 to 10 items to work with. Shuffle the items, producing a randomish arrangement.
Perform a SelectionSort on the list.
Shuffle again, and perform an InsertionSort on the list.
Shuffle again, and perform a BubbleSort on the list.
What do you notice about the algorithms?
In both selection and bubble sort, the comparison is always among the unsorted elements. In insertion sort, the comparison is between the unsorted and sorted elements. In both selection and bubble sorts, we swap the unsorted elements to create the sorted list. In insertion sort, we shift the unsorted elements to create the sorted list. In both selection sort and bubble sort, the sorted list is stable. Once an element is sorted, its position does not change. In insertion sort, the sorted list is unstable. The position of the sorted elements can change.


These algorithms are typically called comparison sorts because they rely on comparing two elements at a time. For each algorithm:
-How many comparisons would it perform for a list of 10 items that were already in order?
Bubble sort will terminate after the first iteration. Once it hsaa gone through all the indexes. 

For selection sort, in each case, it will identify the 1 as the smallest element and then go on to sorting the rest of the list. Because it treats all data sets the same and has no ability to short-circuit the rest of the sort if it ever comes across a sorted list before the algorithm is complete, insertion sort has no best or worst cases. Selection sort always takes O(n2) operations, regardless of the characteristics of the data being sorted. It will take 10 times. 

For Insertion, in the case where the data is already sorted, insertion sort won't have to do any shifting because the local sublist will already be sorted. That is, the first element will already be sorted, the first two will already be sorted, the first three, and so on. In this case, insertion sort will iterate once through the list, and, finding no elements out of order, will not shift any of the data around. 



-How many comparisons does it perform in the worst possible pre-arrangement of 10 items?

The absolute worst case for bubble sort is when the smallest element of the list is at the large end. Because in each iteration only the largest unsorted element gets put in its proper location, when the smallest element is at the end, it will have to be swapped each time through the list, and it wont get to the front of the list until all n iterations have occurred. In this worst case, it take n iterations of n/2 swaps so the order is, again, n2.

Since the order doesn't matter for selection sort, it will still take 10 times to go through everything. It will take the same amount of time. 

For insertion, being in reversed order would be the worse for this method. It would take ten iterations.  

-How many comparisons would you expect it to perform, approximately, on 10 random items? 100? 1000?

Bubble-- 9, 99, 999
Insertion--100, 10,000, 1000000
Selection-- 55, 5050, 500500


If you were searching for an element in a random list, would it be reasonable to use one of these algorithms to sort the list first and use binarySearch, or would you be better off using a normal search? Why or why not?

find something not in the list: ---- this is better than the best possible case and binary is still slower. 
        n:setup step: search step: total:
binary: 10  10+             3.5       23.5  
linear: 10  0               5         15
binary  100 100             6.5        106.6
linear 100 0                50         50 
binary 1000  1000           10         1010
linear 1000 0               500        500


If we can not sort the objects beforehand, it would be better just using the linear search method. If we are just searching for one element, it sorting prior and then doing binary search would take longer. 







