**FizzBuzz Java Application**

This Java application implements the classic FizzBuzz game, a popular programming challenge where numbers are printed from 1 to a given input value. For each number in the sequence, the program checks if the number is divisible by 3, 5, or both, and prints corresponding strings "Fizz," "Buzz," or "FizzBuzz" accordingly. Additionally, the user can choose to play the game or exit the program.

**Features**

- User-friendly console-based application.
- Provides an option for the user to play the FizzBuzz game or exit the program.
- Implements the FizzBuzz logic to handle multiples of 3, 5, and both.
- Allows the user to enter their custom number for the FizzBuzz calculation.
- Provides comprehensive unit tests to ensure code correctness and robustness.

**Getting Started**

1. Clone the repository or download the source code.
2. Ensure you have Java JDK installed on your system.
3. Compile the source code using the command: `javac com/walsh/*.java`
4. Run the program using the command: `java com.walsh.Main`

**How to Play**

1. The program will greet you with a welcome message.
2. You will be prompted to play the FizzBuzz game by entering "Y" (yes) or "N" (no).
3. If you choose to play ("Y"), you will be asked to enter a number for the FizzBuzz calculation.
4. The program will then display the appropriate FizzBuzz result based on the entered number.
5. If you choose not to play ("N"), the program will exit gracefully.

**Test Cases**

The application includes a set of JUnit tests that cover different scenarios and ensure the proper functioning of the FizzBuzz logic and user input handling. The test cases include:

- Testing the user input for "Y" (yes) and "N" (no).
- Testing invalid user input to ensure proper exception handling.
- Checking the FizzBuzz results for various numbers, including multiples of 3, 5, both, and non-multiples.
- Verifying the program's behavior when the user chooses not to play the game.

**How to Run Tests**

1. Ensure you have JUnit 5 (or later) installed on your system.
2. Compile the source code and test files using the command: `javac -cp .:path/to/junit-jupiter-api-<version>.jar:path/to/junit-platform-console-standalone-<version>.jar com/walsh/*.java`
3. Run the tests using the command: `java -jar path/to/junit-platform-console-standalone-<version>.jar -cp .:path/to/junit-jupiter-api-<version>.jar com.walsh.FizzBuzzTest`

**Contributing**

Contributions to this project are welcome. If you encounter any issues or have improvements to suggest, please feel free to create a pull request or open an issue.

**License**

This project is licensed under the MIT License. Feel free to use and distribute it according to the terms mentioned in the LICENSE file.

**Contact**

If you have any questions or feedback, please contact [Ismail Walsh](mailto:i.walsh98@hotmail.co.uk).

**Acknowledgments**

- Thanks to the contributors who helped develop and test this application.
- Inspiration for the FizzBuzz game comes from various programming challenges and interview questions.

Enjoy playing FizzBuzz! Happy coding!
