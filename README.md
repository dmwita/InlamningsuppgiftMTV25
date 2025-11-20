**OVERVIEW**
- This project is a Java console application that reads lines of text from the user until the user types the word "stop". After stopping, the program prints:
- The number of lines(text) entered and
- The total number of characters entered  excluding the line that contains "stop"
  
**TWO CLASSES**
- The project is structured into two classes:
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


**@Testing**

The project includes three JUnit test cases that check:
- Counting multiple lines
- Counting empty lines
- The Stop condition


