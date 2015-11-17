package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witaj w konwerterze temperatury podanej w stopniach Celsjusza na stopnie Fahrenheita.");
        System.out.println("Podaj wartosc temperatury w stopniach Celsjusza.");
        Scanner wej = new Scanner (System.in);
        double a=wej.nextInt();
        System.out.println("Dla podanej temperatury w stopniach Celsjusza temperatura w stopniach Farenheita wynosi:");
        System.out.println( a * 1.8 + 32 + ".");
	// write your code here
    }
}
