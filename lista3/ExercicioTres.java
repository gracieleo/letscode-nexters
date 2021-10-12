
package br.com.letscode.java.lista3;


public class ExercicioTres {
    public static void main(String[] args) {

        //Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares,
        //depois todos os pares.

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("ÍMPARES");
        printOddNumbers(numeros);
        System.out.println("PARES");
        printEvenNumbers(numeros);
    }

    //ímpares
    public static void printOddNumbers(int[] numeros) {
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    //pares
    public static void printEvenNumbers(int[] numeros) {
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    }



