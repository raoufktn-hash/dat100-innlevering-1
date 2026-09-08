package oppgave3;

import java.util.Scanner;

public class Fakultsjon {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);

        System.out.println(" Skriv en tall");
        int n = innput.nextInt();
        int j = fakultert(n);

        System.out.println("fakulltet av " + n + " er: " + j);
        innput.close();
    }
    private static int fakultert(int n ){

        int j= 1;

        for (int i =1; i <= n; i++){
            j = j * i;
        }
        return j;
    }
}
