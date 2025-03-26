# Tic Tac Toe Game

This is a simple implementation of the classic Tic Tac Toe game in Java. The game is played in the console, where two players take turns to mark spaces in a 3x3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

---

## Features

- Two-player game.
- Dynamic 3x3 grid displayed on the console.
- Input validation to ensure valid moves.
- Detects a win, draw, or ongoing game.
- Replay option after the game ends.

---

## Prerequisites

- Java Development Kit (JDK) installed.
- Basic knowledge of running Java programs.

---

## How to Run

1. Clone this repository or download the source code.
2. Open the project in your favorite Java IDE or use the terminal.
3. Compile the `TicTacToe.java` file:

   ```bash
   javac TicTacToe.java
   ```

4. Run the compiled program:

   ```bash
   java TicTacToe
   ```

5. Follow the on-screen instructions to play the game.

---

## How to Play

1. The game board is a 3x3 grid where each cell is identified by a number (1-9):

   ```
    1 | 2 | 3
   -----------
    4 | 5 | 6
   -----------
    7 | 8 | 9
   ```

2. Players take turns to choose a cell by entering the corresponding number.
3. The first player uses `X` and the second player uses `O`.
4. The game ends when:
   - A player aligns three marks in a row (horizontal, vertical, or diagonal).
   - All cells are filled and there is no winner (draw).

5. The program announces the winner or declares a draw.
6. You can choose to play again after the game ends.

---

## Example Gameplay

```
Player 1 (X), enter your move (1-9): 1
    X |   |  
   -----------
      |   |  
   -----------
      |   |  

Player 2 (O), enter your move (1-9): 5
    X |   |  
   -----------
      | O |  
   -----------
      |   |  
```

---

## Screenshots

Here is a screenshot of the game in action:

![image](https://github.com/user-attachments/assets/8c4abe2e-bd50-4c81-a766-de3f05a21698)

> Replace `screenshot.png` with the actual path to your screenshot file.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

Enjoy the game! 😊
