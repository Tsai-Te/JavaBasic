package com.te;

import java.util.Scanner;

public class Tic_Tac_Toe{
    public static final int EMPTY=0;
    public static final int CROSS=1;
    public static final int NOUGHT=2;

    public static final int PLAYING=0;
    public static final int DRAW=1;
    public static final int CROSS_WON=2;
    public static final int NOUGHT_WON=3;

    public static final int ROWS=3,COLUMNS=3;
    public static int[][] board=new int[ROWS][COLUMNS];

    public static int currentState;
    public static int currentPlayer;
    public static int currentRow, currentColumn;

    public static Scanner in=new Scanner(System.in);

    public static void main(String[] args){
        initGame();
        do{
            playerMove(currentPlayer);
            updateGame(currentPlayer, currentRow, currentColumn);
            printBoard();
            if (currentState==CROSS_WON){
                System.out.println("'X' has won.");
            }
            else if (currentState==NOUGHT_WON){
                System.out.println("'O' has won.");
            }
            else if (currentState==DRAW){
                System.out.println("It's a Draw.");
            }
            currentPlayer=(currentPlayer==CROSS) ? NOUGHT : CROSS;
        }
        while (currentState==PLAYING);
    }

    public static void initGame(){
        for (int row=0; row<ROWS; ++row){
            for (int column=0; column<COLUMNS; ++column){
                board[row][column]=EMPTY;
            }
        }
        currentState=PLAYING;
        currentPlayer=CROSS;
    }

    public static void playerMove(int theSeed){
        boolean validInput=false;
        do{
            if (theSeed==CROSS){
                System.out.print("Player 'X', please enter a move at (row[1-3] column[1-3]): ");
            }
            else{
                System.out.print("Player 'O', please enter a move at (row[1-3] column[1-3]): ");
            }
            int row=in.nextInt()-1;
            int column=in.nextInt()-1;
            if (row>=0&&row<ROWS&&column>=0&&column<COLUMNS&&board[row][column] == EMPTY){
                currentRow=row;
                currentColumn=column;
                board[currentRow][currentColumn]=theSeed;
                validInput=true;
            }
            else{
                System.out.println("This move at ("+(row+1) + "," + (column+1)
                        + ") is invalid. Please try again...");
            }
        }
        while (!validInput);
    }

    public static void updateGame(int theSeed, int currentRow, int currentColumn){
        if (hasWon(theSeed, currentRow, currentColumn)){
            currentState=(theSeed==CROSS) ? CROSS_WON:NOUGHT_WON;
        }
        else if (isDraw()){
            currentState=DRAW;
        }

    }

    public static boolean isDraw(){
        for (int row=0;row<ROWS; ++row){
            for (int column=0;column<COLUMNS; ++column){
                if (board[row][column]==EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasWon(int theSeed, int currentRow, int currentColumn){
        return (board[currentRow][0]==theSeed
                && board[currentRow][1]==theSeed
                && board[currentRow][2]==theSeed
                || board[0][currentColumn]==theSeed
                && board[1][currentColumn]==theSeed
                && board[2][currentColumn]==theSeed
                || currentRow==currentColumn
                && board[0][0]==theSeed
                && board[1][1]==theSeed
                && board[2][2]==theSeed
                || currentRow+currentColumn==2
                && board[0][2]==theSeed
                && board[1][1]==theSeed
                && board[2][0]==theSeed);
    }

    public static void printBoard(){
        for (int row=0; row<ROWS; ++row){
            for (int column=0; column<COLUMNS; ++column){
                printCell(board[row][column]);
                if (column !=COLUMNS-1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row !=ROWS-1){
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    public static void printCell(int content){
        switch (content){
            case EMPTY:  System.out.print("   "); break;
            case NOUGHT: System.out.print(" O "); break;
            case CROSS:  System.out.print(" X "); break;
        }
    }
}
