import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int a = 9;
        int b = 3;
        int c = 3;
        int d = a + b + c;
        System.out.println(d);
        d = a - b + c;
        System.out.println(d);
        d= a / b * c;
        System.out.println(d);
        d= a * c + b;
        System.out.println(d);
        d = a % c + b;
        System.out.println(d);


        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x&&y));
        System.out.println("x || y = " + (x||y) );
        System.out.println("!(x && y) = " + !(x && y));
        System.out.println("((x && y) || (!x || y) : " + ((x && y) || (!x || y)));
        System.out.println("!((x || y) || (x || !y) : " + !((x && y) || (!x || y)));
        System.out.println("!((x && y) || (!x || y) : " + !((x && y) || (!x || y)));
        System.out.println("((x && y) %% (x || y) : " + ((x && y) && (x || y)));











    }
}
