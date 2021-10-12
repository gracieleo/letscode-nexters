package br.com.letscode.java.lista2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Qual a temperatura em graus Celsius que você quer converter para Farenheit: ");
        float celsius = sc.nextFloat();

        float farenheit = (1.8f * celsius) + 32f;

        System.out.printf("A temperatura %.1f ºC corresponde a %.1f ºF \n ",celsius,farenheit);

        sc.close();
    }
}
