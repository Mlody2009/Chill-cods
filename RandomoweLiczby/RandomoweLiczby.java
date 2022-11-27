import java.awt.*;
import java.security.SecurityPermission;
import java.util.Random;

public class RandomoweLiczby{

    public static void main(String args[]) {


        //Najpierw, stwórzmy instancję klasy Random
        Random rand = new Random();

        //Teraz, generowanie liczb od 0 do 999.
        int rand_int1 = rand.nextInt(1000);
        //Natomiast jesli chcielibysmy od 0 do 1000
        int rand_int2 = rand.nextInt(1001);

        //Teraz wypiszmy sobie nasze wylosowane liczby.

        System.out.println("Randomowa liczba od 0 do 999: " + rand_int1);
        System.out.println(" ");

        //Pamietaj zeby w System.out.println dodać spację, inaczej tekst będzie sklejony
        //W przeciwnym wypadku będzie wyglądać to tak:

        System.out.println("Sklejony tekst");
        System.out.println(" ");
        System.out.println("Randomowa liczba" + rand_int1);
        System.out.println(" ");
        System.out.println("Randomowa liczba od 0 do 1000: " + rand_int2);
        System.out.println(" ");
        //Teraz losowanie liczb double, czyli liczba ułamkowa.
        //Tutaj już nie wpisujemy zakresu poniewaz nie mialoby to sensu.
        double rand_double1 = rand.nextDouble();

        double rand_double2 = rand.nextDouble();

        System.out.println("Randomowa liczba ułamkowa: " + rand_double1);
        System.out.println(" ");
        System.out.println("Randomowa liczba ułamkowa: " + rand_double2);
        System.out.println(" ");

        //Nadszedł czas na zmienną float.
        float rand_float1 = rand.nextFloat();
        float rand_float2 = rand.nextFloat();
        //Jest to liczba zmiennoprzecinkowa.

        System.out.println("Randomowa liczba zmiennoprzecinkowa: " + rand_float1);
        System.out.println(" ");
        System.out.println("Randomowa liczba zmiennoprzecinkowa: " + rand_float2);

        //Czas na zmienną long
        long rand_long1 = rand.nextLong();
        long rand_long2 = rand.nextLong();

        System.out.println("Randomowa liczba long: " + rand_long1);

        System.out.println("Randomowa liczba long: " + rand_long2);



    }

}
