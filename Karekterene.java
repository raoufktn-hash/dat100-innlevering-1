package oppgave2;

import java.util.Scanner;

public class Karekterene {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);

        System.out.println("skriv inn din poengsum");
        int poeng = innput.nextInt();

        char karakter;

        if (poeng < 0 || poeng > 100){
            System.out.println("ugyldig poengsum");
        }else if (poeng >= 90){
            karakter = 'A';
            System.out.println("karakteren din er " + karakter);
        }else if (poeng >= 80){
            karakter = 'B';
            System.out.println("karakteren din er " + karakter);
        }else if (poeng >= 60){
            karakter = 'C';
            System.out.println("karakteren din er " + karakter);
        }else if (poeng >= 50){
            karakter = 'D';
            System.out.println("karakteren din er " + karakter);
        }else if (poeng >= 40){
            karakter = 'E';
            System.out.println("karakteren din er " + karakter);
        }else {
            karakter = 'F';
            System.out.println("du stræyk med karakter " + karakter);
        }
        innput.close();

    }
}


