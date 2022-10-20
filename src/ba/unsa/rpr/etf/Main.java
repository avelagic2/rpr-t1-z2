/*
* Koristeći IntelliJ IDEA napraviti projekat pod nazivom "rpr-t1-z2". Napravite program koji
na ekranu ispisuje sve brojeve između 1 i n koji su djeljivi sa sumom svojih cifara, pri
čemu se n unosi sa tastature. U programu se obavezno treba nalaziti funkcija
sumaCifara.
* */
package ba.unsa.rpr.etf;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj) {
     int sumiraj = 0, cifra;
     while(broj > 0) {
         cifra =  broj % 10;
         sumiraj+= cifra;
         broj /= 10;
     }
    return sumiraj;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan broj:");
        int i, n;
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }

        }
    }

}