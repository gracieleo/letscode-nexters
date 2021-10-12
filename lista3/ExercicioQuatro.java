
package br.com.letscode.java.lista3;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        //Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.


        Scanner leitor = new Scanner(System.in);

        int [] numeros = new int [5];

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitor.nextInt();
        }

        //maior
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        //menor
        int menor = numeros [0];
        for (int i = 0; i < numeros.length; i++) {
            if( numeros[i] < menor ){
                menor = numeros[i];
           }
        }

        //media
        double medio = 0;
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
            medio = (double) soma / numeros[i];
        }

        System.out.println("O maior valor é = " + maior);
        System.out.println("O menor valor é = " + menor);
        System.out.printf("O média valor é = %.2f\n" ,medio);

        leitor.close();
    }
}
