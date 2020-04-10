# Java-Programming

This repository contains the study materials of Coursera's introductory course to Java programming and computer science by Princeton. Also, I post my code for the weekly assignments periodically.

# Thoughts about the course

This mooc by Princeton is a great start point for anyone who is interested in :
  1. learning basic programming concepts.
     It can be difficult for a beginner, but I would say it's worth it.
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
