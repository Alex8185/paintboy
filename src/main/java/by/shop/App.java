package by.shop;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client klient1 = new Client();
        Celler celler1 = new Celler();

        klient1.heSpeaks();
        celler1.heSpeaks();

    }
}
