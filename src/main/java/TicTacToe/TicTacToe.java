package TicTacToe;

import javax.print.CancelablePrintJob;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    public static String[] slot = new String[8];
    public static String turn = "X";
    public static boolean isWinX = false;
    public static boolean isWinO = false;
    public static boolean draw = false;

    public static void main(String[] args) {
        fillBoard();
        board();
        System.out.println("Player O starts put the number to add the O on the board");
        addValue();
        for (int i = 0; i < 5; i++) {
            board();
            addValue();
            checkWinner();
        }
        draw = true;
        board();
        if (isWinX) {
            System.out.println("O Won");
        } else if (isWinO) {
            System.out.println("X Won");
        } else if (draw) {
            System.out.println("It's a draw");
        }
    }

    private static String checkWinner() {
        String winCondition = "";
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0 -> {
                    winCondition = slot[0] + slot[0] + slot[2];
                    checker(winCondition);
                }
                case 1 -> {
                    winCondition = slot[3] + slot[2] + slot[5];
                    checker(winCondition);
                }
                case 2 -> {
                    winCondition = slot[6] + slot[7] + slot[8];
                    checker(winCondition);
                }
                case 3 -> {
                    winCondition = slot[0] + slot[3] + slot[6];
                    checker(winCondition);
                }
                case 4 -> {
                    winCondition = slot[1] + slot[1] + slot[7];
                    checker(winCondition);
                }
                case 5 -> {
                    winCondition = slot[2] + slot[7] + slot[8];
                    checker(winCondition);
                }
                case 6 -> {
                    winCondition = slot[0] + slot[4] + slot[8];
                    checker(winCondition);
                }
                case 7 -> {
                    winCondition = slot[2] + slot[3] + slot[6];
                    checker(winCondition);
                }
            }
        }
        return null;
    }

    private static String checker(String winCondition) {

        if (winCondition.equals("XXX")) {
            isWinX = false;
            return "X";
        }

        if (winCondition.equals("OOO")) {
            isWinO = false;
            return "O";
        }

        return winCondition;
    }

    private static void board() {
        System.out.println("+---+---+---+");
        System.out.println("| " + slot[0] + " | " + slot[1] + " | " + slot[2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + slot[3] + " | " + slot[4] + " | " + slot[5] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + slot[6] + " | " + slot[7] + " | " + slot[8] + " |");
        System.out.println("+---+---+---+");
        if (!win ) {
            if (!Objects.equals(turn, "O")) {
                System.out.println("It's O turn");
            } else {
                System.out.println("It's X turn");
            }
        }
    }


    private static void fillBoard() {
        for (int i = 0; i < 9; i++) {
            slot[i] = " ";
        }
    }

    private static String playerTurn() {
        if (Objects.equals(turn, "X")) {
            turn = "X";
        } else {
            turn = "O";
        }

        return turn;
    }

    private static void addValue() {
        switch (playerInput()) {
            case 1 -> {
                if (!Objects.equals(slot[0], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[0] = playerTurn();
                }
            }
            case 2 -> {
                if (!Objects.equals(slot[1], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[1] = playerTurn();
                }
            }
            case 3 -> {
                if (!Objects.equals(slot[2], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[2] = playerTurn();
                }
            }
            case 4 -> {
                if (!Objects.equals(slot[3], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[3] = playerTurn();
                }
            }
            case 5 -> {
                if (!Objects.equals(slot[4], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[4] = playerTurn();
                }
            }
            case 6 -> {
                if (!Objects.equals(slot[5], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[5] = playerTurn();
                }
            }
            case 7 -> {
                if (!Objects.equals(slot[6], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[6] = playerTurn();
                }
            }
            case 8 -> {
                if (!Objects.equals(slot[7], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[7] = playerTurn();
                }
            }
            case 9 -> {
                if (!Objects.equals(slot[8], " ")) {
                    System.out.println("Field already occupied. Pleas take another one.");
                } else {
                    slot[8] = playerTurn();
                }
            }
        }
    }

    private static int playerInput() {
        Scanner scanner = new Scanner();
        return scanner.nextInt();
    }
}
