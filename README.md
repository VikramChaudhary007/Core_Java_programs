# Core_Java_programs

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
* Tasks *

Core Java / Logic

1. Check if two strings are anagrams.
2. Find second largest number in array.
3. Rotate array by k positions.
4. Find missing number in array (1–100).
5. Program to swap two numbers without third variable.


String Problems

6. Find longest word in a sentence.
7. Remove all spaces from a string.
8. Check balanced parentheses.
9. Count words in sentence.
10. Print duplicate characters in string.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------


# Language

Java

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

* Tasks Description *

1. Anagram Check Program

# About

This is a simple Java program that checks if two words are **anagrams**.

An anagram means both words have the **same letters but in a different order**.

Example:
listen → silent

# File

AnagramCheck.java

# How the Program Works

1. The program takes two words.
2. It converts them to lowercase.
3. It sorts the letters of both words.
4. It compares the letters.

If the letters are the same, the words are **anagrams**.

# Example Output

Strings are Anagrams.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

2. Second Largest Number in Array

# About

This is a simple **Core Java program** that finds the **second largest number** in an array.

# File

SecondLargestNumber.java

# How the Program Works

1. Create an array of numbers.
2. Sort the array using `Arrays.sort()`.
3. The second last element in the array is the **second largest number**.
4. Print the result.

# Example Array

10, 25, 8, 40, 15, 35

# Output

Second Largest Number: 35


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

3. Rotate Array by K Positions

# About

This is a simple **Core Java program** that rotates the elements of an array by **k positions**.

Rotation means moving the elements of the array to a new position.

# File

RotateArray.java

# How the Program Works

1. Create an array of numbers.
2. Choose the value of **k** (how many positions to rotate).
3. Move the elements of the array by **k positions**.
4. Print the new rotated array.

# Example

Array: 1, 2, 3, 4, 5
k = 2

After rotation:
3, 4, 5, 1, 2

# Output Example

Rotated Array: 3 4 5 1 2

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

 4.  Find Missing Numbers (0–100)

# About

This is a simple **Core Java program** that finds all **missing numbers between 0 and 100**.

The user enters some numbers, and the program checks which numbers are **not present** in the list.

# File

FindMissingNumbers.java

# How the Program Works

1. The user enters how many numbers they want to input.
2. The user enters numbers between **0 and 100**.
3. The program stores the numbers in an **array**.
4. The program checks every number from **0 to 100**.
5. If a number is not found in the array, it is printed as a **missing number**.

# Example

Input:
Enter how many numbers you will input: 5

Numbers entered:
1 2 4 6 10

Output:
Missing numbers are:
0 3 5 7 8 9 ... 100

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

5. Swap Two Numbers Without Third Variable

# About

This is a simple **Core Java program** that swaps two numbers **without using a third variable**.

# File

SwapNumbers.java

# How the Program Works

1. Two numbers are stored in variables `a` and `b`.
2. The program swaps the numbers using **addition and subtraction**.
3. After swapping, the values of `a` and `b` are exchanged.

# Example

Before Swapping
a = 67
b = 46

After Swapping
a = 46
b = 67

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

6. Find Longest Word in a Sentence

# About

This is a simple **Core Java program** that finds the **longest word in a sentence**.

# File

LongestWord.java

# How the Program Works

1. The program stores a sentence in a string.
2. The sentence is split into words using `split(" ")`.
3. Each word is checked to find the longest one.
4. The longest word is printed.

# Example

Sentence:
Java programming is very powerful

Output:
Longest word: programming

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------


7. Remove All Spaces from a String

# About

This is a simple **Core Java program** that removes all spaces from a string.

# File

RemoveSpaces.java

# How the Program Works

1. The program stores a string.
2. It uses the `replace()` method to remove spaces.
3. The new string without spaces is printed.

# Example

Original String:
Java programming is fun.

Output:
Javaprogrammingisfun.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

8. Check Balanced Parentheses

# About

This is a simple **Core Java program** that checks whether the parentheses in a string are **balanced or not**.

Balanced parentheses means every **opening bracket** has a correct **closing bracket**.

# File

BalancedParentheses.java

# How the Program Works

1. The program reads a string containing brackets.
2. It uses a **Stack** to store opening brackets.
3. When a closing bracket appears, it checks if it matches the last opening bracket.
4. If all brackets match correctly, the parentheses are balanced.

# Example

Input:
{[()]}

Output:
Parentheses are Balanced

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

9. Count Words in a Sentence

# About

This is a simple **Core Java program** that counts the number of **words in a sentence**.

# File

CountWords.java

# How the Program Works

1. The program stores a sentence in a string.
2. The sentence is split into words using `split(" ")`.
3. The number of words is counted using the array length.

# Example

Sentence:
Java programming is very interesting

Output:
Total words: 5

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

10. Print Duplicate Characters in a String

# About

This is a simple **Core Java program** that finds and prints **duplicate characters** in a string.

# File

DuplicateCharacters.java

# How the Program Works

1. The program stores a string.
2. The string is converted into a character array.
3. The program compares characters using loops.
4. If the same character appears more than once, it is printed as a duplicate.

# Example

String:
programming

Output:
r
g
m





