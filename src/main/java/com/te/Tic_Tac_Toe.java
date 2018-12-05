package com.te;

import java.util.Scanner;

public class Tic_Tac_Toe {
        public static final int EMPTY = 0;
        public static final int CROSS = 1;
        public static final int NOUGHT = 2;

        public static final int PLAYING = 0;
        public static final int DRAW = 1;
        public static final int CROSS_WON = 2;
        public static final int NOUGHT_WON = 3;

        public static final int ROWS = 3, COLS = 3;
        public static int[][] board = new int[ROWS][COLS];

        public static int currentState;
        public static int currentPlayer;
        public static int currntRow, currentCol;

        public static Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            initGame();
            do {
                playerMove(currentPlayer);
                updateGame(currentPlayer, currntRow, currentCol);
                printBoard();
                if (currentState == CROSS_WON) {
                    System.out.println("'X' won! Bye!");
                } else if (currentState == NOUGHT_WON) {
                    System.out.println("'O' won! Bye!");
                } else if (currentState == DRAW) {
                    System.out.println("It's a Draw! Bye!");
                }
                currentPlayer = (currentPlayer == CROSS) ? NOUGHT : CROSS;
            } while (currentState == PLAYING); // repeat if not game-over
        }

        public static void initGame() {
            for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                    board[row][col] = EMPTY;
                }
            }
            currentState = PLAYING;
            currentPlayer = CROSS;
        }

        public static void playerMove(int theSeed) {
            boolean validInput = false;
            do {
                if (theSeed == CROSS) {
                    System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
                } else {
                    System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
                }
                int row = in.nextInt() - 1;
                int col = in.nextInt() - 1;
                if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) {
                    currntRow = row;
                    currentCol = col;
                    board[currntRow][currentCol] = theSeed;
                    validInput = true;  
                } else {
                    System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                            + ") is not valid. Try again...");
                }
            } while (!validInput);  // repeat until input is valid
        }

        /** Update the "currentState" after the player with "theSeed" has placed on
         (currentRow, currentCol). */
        public static void updateGame(int theSeed, int currentRow, int currentCol) {
            if (hasWon(theSeed, currentRow, currentCol)) {  // check if winning move
                currentState = (theSeed == CROSS) ? CROSS_WON : NOUGHT_WON;
            } else if (isDraw()) {  // check for draw
                currentState = DRAW;
            }
            // Otherwise, no change to currentState (still PLAYING).
        }

        /** Return true if it is a draw (no more empty cell) */
        // TODO: Shall declare draw if no player can "possibly" win
        public static boolean isDraw() {
            for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                    if (board[row][col] == EMPTY) {
                        return false;  // an empty cell found, not draw, exit
                    }
                }
            }
            return true;  // no empty cell, it's a draw
        }

        /** Return true if the player with "theSeed" has won after placing at
         (currentRow, currentCol) */
        public static boolean hasWon(int theSeed, int currentRow, int currentCol) {
            return (board[currentRow][0] == theSeed         // 3-in-the-row
                    && board[currentRow][1] == theSeed
                    && board[currentRow][2] == theSeed
                    || board[0][currentCol] == theSeed      // 3-in-the-column
                    && board[1][currentCol] == theSeed
                    && board[2][currentCol] == theSeed
                    || currentRow == currentCol            // 3-in-the-diagonal
                    && board[0][0] == theSeed
                    && board[1][1] == theSeed
                    && board[2][2] == theSeed
                    || currentRow + currentCol == 2  // 3-in-the-opposite-diagonal
                    && board[0][2] == theSeed
                    && board[1][1] == theSeed
                    && board[2][0] == theSeed);
        }

        /** Print the game board */
        public static void printBoard() {
            for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                    printCell(board[row][col]); // print each of the cells
                    if (col != COLS - 1) {
                        System.out.print("|");   // print vertical partition
                    }
                }
                System.out.println();
                if (row != ROWS - 1) {
                    System.out.println("-----------"); // print horizontal partition
                }
            }
            System.out.println();
        }

        /** Print a cell with the specified "content" */
        public static void printCell(int content) {
            switch (content) {
                case EMPTY:  System.out.print("   "); break;
                case NOUGHT: System.out.print(" O "); break;
                case CROSS:  System.out.print(" X "); break;
            }
        }
    }

