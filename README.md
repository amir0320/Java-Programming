# Java-Programming

This repository contains the study materials of Coursera's introductory course to Java programming and computer science by Princeton. Also, I post my code for the weekly assignments periodically.

# Thoughts about the course

This mooc by Princeton is a great start point for anyone who is interested in :
  1. learning basic programming concepts.
     It can be challenging for a beginner, but I would say it's worth it.
  2. getting a grasp of what Java programming is like.
     Well, in that case, I would assume you are a somewhat seasoned programmer. Then the pdfs and assignments should be sufficient enough.
  3. procrastinating while learning.
     Yes. I am writing this one down. I found it's easier/happier/healthier to procrastinate while I'm doing something else. It almost sounds like I am not procrastinating but **busy** with some other stuff. My **bad** deed seems to justify to be some meaningful action. Although my consciousness won't abide by this lie. But you know, at least I'm trying. Life is hard.

# Notes on the Assignments

## [Week 1: Basic Programming Concepts](https://coursera.cs.princeton.edu/introcs/assignments/hello/specification.php)
1. **HelloGoodbye**

  Be careful with the message you print out. It should be `Hello A and B.` and then `Goodbye B and A.`. I know it's a straight forward question, but you can't blame me for underestimating a HelloWorld program. No, don't judge me. Just admit that it's a fair point.

2. **Integers and booleans**

  Just aware that the command-line arguments are not necessarily sequential. Pay attention to the corner cases. Other than that is just basic programming.

3. **Floating-point numbers and the Math library**

  Copy and paste:

  > Hint: The command-line arguments are given in degrees but Java’s trigonometric functions use radians. Use Math.toRadians() to convert from degrees to radians.

4. **Type conversion**

  Calculate the rgb value (which should be int) **after** you process all the white, red, green, blue values (which should be double).

Voilà! There you have it! If you get stuck for hours, you can take a look at [my code](http://github.com/amir0320/Java-Programming/tree/master/01_basic-programming-concepts/homework). But I would recommend you writing your own version of code instead of just copying mine. That's how you can get the most out of this learning experience.

## [Week 2: Conditionals and Loops](https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php)
1. **Generalized harmonic numbers**

  A simple for loop will do the work.

2. **Band matrices**

  I use a string to store every row pattern and print them out recursively. However, the String concatenation method is not necessary here. You can certainly improve the memory efficiency by using alternative implementation. I'm just too lazy to change my code.

3. **Random walk**

  Just keep track of the current position (x and y coordinates) and the number of steps taken, and everything else should be alright. You know, just some basic coding and debugging time spent here and there...

4. **Random walkers**

  `Random Walker` within a loop. Mic drop.

Hmm, I start wondering if anyone would ever take time reading this. If it turns out to be a self-entertain act, I wouldn't be discouraged.  I'm actually getting some level of enjoyment out of this. Right, almost forgot to mention my code is [here](https://github.com/amir0320/Java-Programming/tree/master/02_conditionals-and-loops/homework).

## [Week 3: Arrays](https://coursera.cs.princeton.edu/introcs/assignments/arrays/specification.php)
1. **Discrete distribution**

  I have to say that after years of studying and taking CS courses both online and on campus, this course's assignments offer the most thorough and even a bit hand-holdingly description. I would say about 95% of your questions can be resolved by simply reading the question's specification and the relative FAQ. It's a nice thing to have, but I try not to take it as default. You know, real life programming would never be so nice and thoughtful.

  Anyway, I'm talking too much. I use binary search to find the index, but you don't have to. There're many other options out there or you can simply loop through all the indexes, but do know that it would be inefficient. If you are a beginner to programming and feel lost, don't worry. You would learn more about these different search methods and algorithms in the near future.

2. **Thue–Morse weave**

  Two for loops will do the job. In terms of how to define the Thue-Morse sequence, once again we turn to the [FAQ page](https://coursera.cs.princeton.edu/introcs/assignments/arrays/faq.php) and it gives a brief yet clean strategy.

3. **Birthday problem**

  Two things that are good to know:
  1. within the range of 0 to n-1, we need **at most** n people to enter the room and have two people have the same birthday, which would be the worst case, that is the first n-1 people entered the room all have different birthdays.
  2. in order to randomly choose a number between a lower bound(inclusive) and a upper bound(exclusive), you can do: `Min + (int) (Math.random() * (Max - Min))`.


4. **Minesweeper**

  Also there are two things to notice:
  1. it would be easier to deal with if you set the grid to be m+2 by n+2. There would be no more out of bound problems for the boundary cases.
  2. how to randomly choose a cell from a 2D array while only using one Math.random() method? you can do:
  ```
  int pos = (int) (Math.random() * (n+2) * (m+2));
  int mineRow = pos % (m+2);
  int mineCol = pos / (m+2);
  ```

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/03_arrays/homework).

## [Week 4: Input and Output](https://coursera.cs.princeton.edu/introcs/assignments/io/specification.php)
1. **Shannon Entropy**

  Call StdOut.printf("%.4f\n", x) to print a floating-point number x with 4 digits of precision after the decimal points. Yeah, I'm shamelessly doing copy and paste again.

2. **Checkerboard**

  Keep in mind that the starting point is on the bottom left, and the first square you draw must be blue.

3. **World maps**

  Make use of the `StdDraw.enableDoubleBuffering();` and `StdDraw.show();` methods. They can help with the slow drawing process.

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/04_input-and-output/homework).

## [Week 5: Functions and Libraries](https://coursera.cs.princeton.edu/introcs/assignments/functions/specification.php)
1. **Activation functions**

  Use Double.isNaN(x) to detect whether x is NaN.

  Use ` Double.POSITIVE_INFINITY` and `Double.NEGATIVE_INFINITY` to check if you're dividing infinity by infinity.

2. **Greatest common divisors**

  Just do it.

3. **Audio collage**

  Reminds me of my first art collage. Both utterly simple and sort of fun.

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/05_functions-and-libraries/homework).

## [Week 6: Recursion](https://coursera.cs.princeton.edu/introcs/assignments/recursion/specification.php)
1. **Trinomial coefficients (brute force)**

  This one should be simple enough to skip.

2. **Trinomial coefficients (dynamic programming)**

  Now this one is a bit tricky. The former brute force method is taking super long time to calculate the coefficients once n reaches 30 or something bigger than. The reason is that by using the recursive approach, it's always splitting n into smaller numbers and repeating the same calculations over and over. For example, `trinomial(20, 10)` will call `trinomial(19, 9) + trinomial(19, 10) + trinomial(19, 11)`, and `trinomial(20, 11)` will call `trinomial(19, 10) + trinomial(19,11) + trinomial(19,12)`. As you can see, there are some redundancies we surely want to avoid.

  Thus enters the dynamic programming approach. Unlike the brute force method, which is a top-down approach, you start from the bottom. You calculate the base cases first and store them into an array, and any time you need those values, you don't have to calculate them again.

  There are two ways to define the array. One is to set its length at 2n+1, which can store every coefficients for the expanded trinomial functions. The other is to set the range at n+1. Because the coefficients are symmetry, you can achieve higher memory efficiency by following this approach.

3. **Reve's puzzle**

  It's quite a straightforward question if you look closely at the picture on the assignment specification page. Really, just take a look and you should figure it out in no time.

4. **Recursive squares**

  Another straightforward question, except that I don't understand why I have to call drawSquare in my main function. Must be an error.

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/06_recursion/homework).

## [Week 7: Performance](https://coursera.cs.princeton.edu/introcs/assignments/performance/specification.php)
1. **Inversions**

  At first I use this approach for the generate method:
  ```java
  while (inversionsToGenerate > 0 && firstIndex <= lastIndex) {
        if (lastIndex != firstIndex) {
                swap the last item and the item before it;
                inversionsToGenerate--;
                lastIndex--;
        } else {
                // narrow down the range and repeat this process until we have all the inversions
                firstIndex++;
                lastIndex = n-1;
        }
  }
  ```
  The good thing about this method is it's easy to comprehend and implement, which is why it pops up as my first take. However, it does have some drawbacks. Although I pass all the correctness tests, I lose several points for the timing tests. Hence the second approach:

  Use a greedy approach. If k≥n−1, put element n−1 first in the permutation, so that it is inverted with n−1 elements; otherwise put it last in the permutation, so that it is inverted with 0 elements. Then subtract 1 from the lastIndex to narrow down the range of the array. With each iteration, n should be decreased by 1, so that we can make sure that we put all numbers from 0 to n-1 in the right position.

2. **Ramanujan numbers**

  It begins with calculating a = n^(1/3), and b = (n−a^3)^(1/3). Of course you need to convert them into integers and check if the sum of the two numbers is n, if so, you get the first set of roots; otherwise, keep looking.

3. **Maximum square submatrix**

  This one reminds me of the Minesweeper problem in assignment 3. But not exactly. I must've seen it somewhere else.

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/07_performance/homework).

## [Week 8: Abstract Data Types](http://coursera.cs.princeton.edu/introcs/assignments/oop1/specification.php)
1. **Huntington's disease detector**

   This one should be simple enough to skip.

2. **Kernel filter**

   Use modulo(%) for periodic boundary conditions. You will probably get a warning that "Using a quadruple nested loop suggests poor design in this program." Don't worry, I've asked about it on the forum and the instructor replied, "In general, quadruple nested loops indicate poor design. But, I think kernel filter is an exception, so I'll add it to the Checkstyle exceptions." So we're good.

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/08_abstract-data-types/homework).

## [Week 9: Creating Data Types](http://coursera.cs.princeton.edu/introcs/assignments/oop2/specification.php)
1. **Color data type**

   This one should be simple enough to skip.

2. **Clock data type**

   Two things could be helpful.
   ```java
   if (something goes wrong) {
        throw new IllegalArgumentException("invalid argument");
   }
   ```
   and `String regex = "^\\d{2}:\\d{2}";` to check if the clock's format is correct.

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/09_creating-data-types/homework).

## [Week 10: Programming Languages](https://coursera.cs.princeton.edu/introcs/assignments/barchart/specification.php)

   If you manage to finish all the assignments before week 10, this one should be trivial. I've spent few months on this course, and I would say it's worth it. I've definitly learned a lot and improved my familiarity with Java. Whoever comes across my repo, I sincerely hope I can be of help, for I know learning is hard, and doing it online is much difficult.

The end. The code is [here](https://github.com/amir0320/Java-Programming/tree/master/10_programming-languages/homework).
