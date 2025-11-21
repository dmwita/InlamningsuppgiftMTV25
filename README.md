This repository contains my solution for **Part 2** and **Part 3** of the School Java programming assignment.The program is built using OOP, JUnit, and version control(Github).

**OVERVIEW**
- This program is a Java console application that reads lines of text from the user until the user types the word "stop".
 After stopping, the program prints:
- The number of lines(text) entered and
- The total number of characters entered  excluding the line that contains "stop"

**Part 2: Requirements**
  
**TWO CLASSES**
- The program is structured into two classes:
1. TextCounter :- Tracks lines and character counts.
2. TextReader :- Reads user input, detects the stop command, and outputs the final result.

**THREE TEST CASES**
- JUnit test cases are included to verify the correctness of the TextCounter class.


**How It Works**
1. Run the program
- When executed, the program prompts:
- Enter text (type 'stop' to finish):
- You can type any text followed by stop if you want to finish.

**Example:**
- Mambo
- Thomas
- Inspiring teacher
- stop

**OUTPUT:**
- Number of lines: 3
- Total characters: 25 (This depends on the user input).

**@Testing: part 2**

The program includes three JUnit test cases that check:
- Counting multiple lines
- Counting empty lines
- The Stop condition

**Part 3: Extended Requirements**
In this part we add new functionality
- Number of words
- The longest word
NB: The "stop" is included in the logic class(TextCounter)

**@Testing part 3**
These are updated JUnit tests cases
- Counting lines
- Counting word
- detect the longest word
- Behaviour of the "stop" command
  
**Summary part 3: How it works**
- The program reads lines until the user types "stop", and all text processing is handled by the logic class(TextCounter). It counts lines, characters, words, and finds the longest word, while TextReader handles the input or output. When "stop" is detected, the program stops reading and prints the final results.

  


