package oppgave2;

import java.util.Scanner;
//oppgave2c
public class Karakterene3 {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.println("skriv in poengsummen for eleven");
            int poeng = innput.nextInt();

            while (poeng < 0 || poeng > 100 ){
                System.out.println("Ugyldig poengsum! Skriv inn på nytt:");
                poeng = innput.nextInt();
            }

            char karakter;

             if (poeng >= 90) {
                karakter = 'A';
                System.out.println("karakteren din er " + karakter);
            } else if (poeng >= 80) {
                karakter = 'B';
                System.out.println("karakteren din er " + karakter);
            } else if (poeng >= 60) {
                karakter = 'C';
                System.out.println("karakteren din er " + karakter);
            } else if (poeng >= 50) {
                karakter = 'D';
                System.out.println("karakteren din er " + karakter);
            } else if (poeng >= 40) {
                karakter = 'E';
                System.out.println("karakteren din er " + karakter);
            } else {
                karakter = 'F';
                System.out.println("du stræk med karakter " + karakter);
            }
        }
        innput.close();

    }
}








