import java.util.Objects;
import java.util.Scanner;
public class TicTacToe {
    public static Boolean value = false;
    public static void main(String [] args) {
        boolean  won = false;
        String[][] fields = new String[3][3];

        setup(fields);
        field(fields);
        while (!won) {
            System.out.println("Please enter a number from 1 to 9");
            addValue(fields);
            field(fields);
        }

    }

    public static int turn() {
        Scanner  input = new Scanner(System.in);
        int eingabe = input.nextInt();
        return eingabe;
    }

    public static String playerTurn() {
        String playerValue;
        if (value) {
            playerValue = "X";
            value = false;
        } else {
            playerValue = "O";
            value = true;
        }
        return playerValue;
    }

    private static void field(String[][] fields) {
        System.out.println(" "+ fields[0][0] +" | "+ fields[0][1]+" | "+ fields[0][2]+"");
        System.out.println("---|---|---");
        System.out.println(" "+ fields[1][0]+" | "+ fields[1][1]+" | "+ fields[1][2]+"");
        System.out.println("---|---|---");
        System.out.println(" "+ fields[2][0]+" | "+ fields[2][1]+" | "+ fields[2][2]+"");
    }

    private static void setup(String[][] fields) {
        fields[0][0] = " ";
        fields[0][1] = " ";
        fields[0][2] = " ";
        fields[1][0] = " ";
        fields[1][1] = " ";
        fields[1][2] = " ";
        fields[2][0] = " ";
        fields[2][1] = " ";
        fields[2][2] = " ";
    }

    private static void addValue(String[][] fields){
        switch (turn()) {
            case 1 -> {
                if (Objects.equals(fields[0][0], "X") || Objects.equals(fields[0][0], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[0][0] = playerTurn();
                    addValue(fields);
                }
            }
            case 2 -> {
                if (Objects.equals(fields[0][1], "X") || Objects.equals(fields[0][1], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[0][1] = playerTurn();

                }
            }

            case 3 -> {
                if (Objects.equals(fields[0][2], "X") || Objects.equals(fields[0][2], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[0][2] = playerTurn();
                }
            }

            case 4 -> {
                if (Objects.equals(fields[1][0], "X") || Objects.equals(fields[1][0], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[1][0] = playerTurn();
                }
            }

            case 5 -> {
                if (Objects.equals(fields[1][1], "X") || Objects.equals(fields[1][1], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[1][1] = playerTurn();
                }
            }

            case 6 -> {
                if (Objects.equals(fields[1][2], "X") || Objects.equals(fields[1][2], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[1][2] = playerTurn();
                }
            }

            case 7 -> {
                if (Objects.equals(fields[2][0], "X") || Objects.equals(fields[2][0], "O")) {
                    System.out.println("Field already occupied");

                } else {
                    fields[2][0] = playerTurn();
                }
            }

            case 8 -> {
                if (Objects.equals(fields[2][1], "X") || Objects.equals(fields[2][1], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[2][1] = playerTurn();
                }
            }

            case 9 -> {
                if (Objects.equals(fields[2][2], "X") || Objects.equals(fields[2][2], "O")) {
                    System.out.println("Field already occupied");
                } else {
                    fields[2][2] = playerTurn();
                }
            }
        }
    }

    public static void horizontalWinPositions(String[][] fields) {
    }

    public static void verticalWinPositions() {

    }

    public static void diagonalWinPositions() {

    }

    public static void drawPositions() {

    }
}
