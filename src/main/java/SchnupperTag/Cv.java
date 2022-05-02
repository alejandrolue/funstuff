package SchnupperTag;

public class Cv {
    public static void main(String[] args) {
        CvOutput();
    }

    public static void CvOutput() {
        System.out.print("+");
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println("");

        for (int f = 0; f < 6; f++) {
            System.out.print("|");
            if (f == 0) {
                Spaces(20);
                System.out.print("Über Mich");
                Spaces(21);
            } else if (f == 1) {
                Spaces(17);
                System.out.print("Alejandro Lüthi");
                Spaces(18);
            } else if (f == 2) {
                Spaces(23);
                System.out.print("18");
                Spaces(25);
            } else if (f == 3) {
                Spaces(19);
                System.out.print("3. Lehrjahr");
                Spaces(20);
            } else if (f == 4) {
                Spaces(21);
                System.out.print("Hobby's");
                Spaces(22);
            } else if (f == 5) {
                Spaces(8);
                System.out.print("Fussball, Tennis und Wakeboarding");
                Spaces(9);
            }
            System.out.println("|");
        }
        System.out.print("+");
        for (int a = 0; a < 50; a++) {
            System.out.print("-");
        }
        System.out.print("+");

    }

    public static void Spaces(int lol) {
        for (int m = 0; m < lol; m++) {
            System.out.print(" ");
        }
    }
}
