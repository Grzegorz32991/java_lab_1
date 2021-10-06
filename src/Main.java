import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */


        //zad1

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj Imię: ");
        String Imie = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj numer indeksu: ");
        int nr_indeksu = scan.nextInt();

        System.out.println(" Imię:" + Imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek + " Nr indeksu: " + nr_indeksu +"");
        System.out.printf("Imię: %s Nazwisko: %s Wiek: %d Nr indeksu %d \n", Imie, nazwisko, wiek, nr_indeksu);



        //zad2
        int zmiennapierwsza = 9;
        int zmiennadruga = 7;
        int wynik_dodawania = zmiennapierwsza + zmiennadruga;
        int wynik_odejmowania = zmiennapierwsza - zmiennadruga;
        int wynik_mnozenia = zmiennapierwsza * zmiennadruga;
        int wynik_dzielenia = zmiennapierwsza / zmiennadruga;
        int wynik_modulo = zmiennapierwsza % zmiennadruga;

        System.out.println("\n wynik dodawania: " + wynik_dodawania+ "\n wynik odejmowania: " + wynik_odejmowania + "\n wynik mnożenia: " + wynik_mnozenia + "\n wynik dzielenia: " + wynik_dzielenia + "\n wynik modulo: " + wynik_modulo);



    }
}
