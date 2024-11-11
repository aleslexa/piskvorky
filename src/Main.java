import java.util.Scanner;

public class Main {


    public static void PrintTabulka(char[] tabulka) {
        System.out.println("- - - - - - -");
        System.out.println("| " + tabulka[0] + " | " + tabulka[1] + " | " + tabulka[2] + " | ");
        System.out.println("- - - - - - -");
        System.out.println("| " + tabulka[3] + " | " + tabulka[4] + " | " + tabulka[5] + " | ");
        System.out.println("- - - - - - -");
        System.out.println("| " + tabulka[6] + " | " + tabulka[7] + " | " + tabulka[8] + " | ");
        System.out.println("- - - - - - -");
    }

    public static void main(String[] args) {

        int cisloTahu = 1;
        char znak = 'X';
        char[] tabulka = new char[9];
        for (int i = 0; i < 9; i++) {
            tabulka[i] = ' ';

        }
        while (cisloTahu <= 9) {
            PrintTabulka(tabulka);

            System.out.print("Hráči (" + znak + ") vlož číslo pole (1-9) : ");
            Scanner scanner = new Scanner(System.in);
            int vstup = scanner.nextInt();


            if (vstup >= 1 && vstup <= 9 && tabulka[vstup - 1] != 'X' && tabulka[vstup - 1] != 'O') {
                tabulka[vstup - 1] = znak;
                if ((tabulka[0] + tabulka[1] + tabulka[2] == (znak * 3))
                        || (tabulka[3] + tabulka[4] + tabulka[5] == (znak * 3))
                        || (tabulka[6] + tabulka[7] + tabulka[8] == (znak * 3))
                        || (tabulka[0] + tabulka[3] + tabulka[6] == (znak * 3))
                        || (tabulka[1] + tabulka[4] + tabulka[7] == (znak * 3))
                        || (tabulka[2] + tabulka[5] + tabulka[8] == (znak * 3))
                        || (tabulka[0] + tabulka[4] + tabulka[8] == (znak * 3))
                        || (tabulka[2] + tabulka[4] + tabulka[6] == (znak * 3))) {

                    PrintTabulka(tabulka);

                    System.out.println("Hráči (" + znak + ") vyhrál jsi!");
                    break;
                } else if (cisloTahu == 9) {

                    PrintTabulka(tabulka);
                    System.out.println("Remíza!");
                    break;

                } else {

                    cisloTahu++;
                    if (znak == 'X') {
                        znak = 'O';
                    } else {
                        znak = 'X';
                    }

                }
            } else {
                System.out.println("Neplatný tah. Zkus to znovu.");
            }
        }
    }
}