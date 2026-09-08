package oppgave1;

import java.util.Scanner;

public class Trinnskatt {
     public static void main(String[] args) {
         Scanner innput = new Scanner(System.in);

         System.out.println("Skriv inn dinn bruttoinntekt: ");
         double inntakt = innput.nextDouble();
         double skatt = 0;

         if (inntakt <= 226100){
             System.out.println("du har igen skat");
         }
         else if (inntakt <= 318301){
             skatt = (inntakt - 226100) * 0.017;
             System.out.println("Trinnskatt: " + skatt + "kr");
         }
         else if (inntakt <= 725051){
             skatt = (inntakt - 318300) * 0.04;
             System.out.println("Trinnskatt: " + skatt + " kr");
         }
         else  if (inntakt <= 980101){
             skatt = (inntakt - 725050) * 0.168;
             System.out.println("Trinnskatt:" + skatt + "kr");
         }
         else if (inntakt <= 1467201){
             skatt = (inntakt - 980100) * 0.168;
             System.out.println("Trinnskatt: " + skatt + " kr");
         }else {
             skatt = (inntakt - 1467200) * 0.78;
             System.out.println("Trinnskatt: " + skatt + " kr");
         }
         innput.close();

    }
}
