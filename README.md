# Data-Structures :sun_with_face: :new_moon_with_face:                                      
#### This Repository is used to help with the understanding of data-structures and there relation to time complexities

#### &nbsp;&nbsp;&nbsp;&nbsp;Data structures are a data organization, management and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data. Whenever data exists it must have some kind of data structure in order to be stored in a computer.

## Continguous or Linked data structures

#### Data Structures can be classified as either contiguous or linked depending on whether they are based on arrays or pointers:

### 1. Contiguous
> These are made of single chuncks of memory, examples of such structures include arrays, matrices, heaps, and hash tables. Some of the advantages include the following:

    * linked structures require allocating extra space for storing pointers
    * arrays allow efficient and quick acces to an item 

### 2. Linked
> These are distinct chunks of memory linked together by pointers (references to one another). Examples of these data structures include lists, trees, and graph adjacency lists.Some of the advantages include the following:
> 
    * overflow is more difficult to occur than it is in an array
    * insertions are simpler when compared to contiguous data structures such as arrays
    * linked structures dont need to know the size on initialization 

## Asymptotic Notations

### Big-O(Oh) Notation
> &nbsp;&nbsp;&nbsp;&nbsp;Big-O notation represent the upper bound running time complexity of an algorithm. It specifically describes the worst case scenario for time complexity and memory consumption. The mathematical desciprtion is as follows:
```
Mathematical Description: 
let n = number of steps and c = some constant value   
f(n) = O(g(n))
IFF  
f(n) <= c*g(n) where n > n0, c > 0, n0 > 1
```
![Big-O(Oh) Notation](https://github.com/Christien-Soosaipillai/Data-Structures/blob/main/images/bigO.png)

### Big-Ω(0mega) Notation
> &nbsp;&nbsp;&nbsp;&nbsp;Big-Ω notation represents the lower bound running time complexity of an algorithm. It specifically describes the best case scenario for the time complexity and memory consumption. The mathematical description is as follows:
```
Mathematical Description: 
let n = number of steps and c = some constant value   
f(n) = Ω(g(n))
IFF  
f(n) >= c*g(n) where n > n0, c > 0, n0 > 1
```
![Big-Ω(0mega)](https://github.com/Christien-Soosaipillai/Data-Structures/blob/main/images/omega-notation.png)

### Big-Θ(Theta) Notation
> &nbsp;&nbsp;&nbsp;&nbsp;Big-Θ(Theta) notation bounds a function from above and below, so it defines exact asymptotic behavior. It specifically describes the average case scenario for the time complexity and memory consumption. The mathematical description is as follows:
```
Mathematical Description: 
let n = number of steps and c1,c2 = some constant values   
f(n) = Ω(g(n))
IFF  
c1*g(n) >= f(n) >= c2*g(n) where n > n0, c1,c2 > 0, n0 > 1
```
![Big-Θ(Theta) Notation](https://github.com/Christien-Soosaipillai/Data-Structures/blob/main/images/Theta-Notation.png)


<hr>

### References
* https://www.bigocheatsheet.com/
* https://cooervo.github.io/Algorithms-DataStructures-BigONotation/data-structures.html
* https://www.geeksforgeeks.org/analysis-algorithms-big-o-analysis/
* https://www.geeksforgeeks.org/analysis-of-algorithms-set-1-asymptotic-analysis/


