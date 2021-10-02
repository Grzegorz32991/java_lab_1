import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        int zmienna1;
        zmienna1 = 8;
        int zmienna2 = 16;
        System.out.println("zmienna1 = " + zmienna1);
        System.out.println("zmienna2 = " + zmienna2);

        int a, b = 5, c, d, e= 15;
        int wynik = b + e;
        System.out.println("wynik = " + wynik);

        int f, g =6, i, p = 12;
        int wynik2 = g * p;
        System.out.println("wynik2 = " + wynik2);



        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *
        *
        *
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        //cw1

        int LiczbaA = 51;
        int LiczbaB = 10;
        int wynik3 = LiczbaA + LiczbaB;
        System.out.println("wynik3 =" + wynik3);

        int wynik4 = LiczbaA - LiczbaB;
        System.out.println("wynik4 =" + wynik4);

        int wynik5 = LiczbaA * LiczbaB;
        System.out.println("wynik5 =" + wynik5);

        int wynik6 = LiczbaA / LiczbaB;
        System.out.println("wynik6 =" + wynik6);

        int wynik7 = LiczbaA % LiczbaB;
        System.out.println("wynik7 =" + wynik7);

        //cw2

        double LiczbaX =20.5;
        double LiczbaY = 2.10;
        double wynik8 = LiczbaX + LiczbaY;
        System.out.println("wynik8 =" + wynik8);

        double wynik9 = LiczbaX - LiczbaY;
        System.out.println("wynik9 =" + wynik9);

        double wynik10 = LiczbaX * LiczbaY;
        System.out.println("wynik10 =" + wynik10);

        double wynik11 = LiczbaX / LiczbaY;
        System.out.println("wynik11 =" + wynik11);

        double wynik12 = LiczbaX % LiczbaY;
        System.out.println("wynik12 =" + wynik12);


    }
}
