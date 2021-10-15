import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] podatek = new double[5];
        podatek[0] = 154.25;
        podatek[1] = 558.91;
        podatek[2] = 1254.65;
        podatek[3] = 987.12;
        podatek[4] = 87.12;
        for(int i=0; i < podatek.length; i++) {
            System.out.println(podatek[i]);
        }
    }
}
