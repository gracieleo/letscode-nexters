
package br.com.letscode.java.lista3;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        // Escreva um programa que lê uma palavra e a escreve de volta ao contrário.

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = leitor.next();

        System.out.print("A palavra ao contrário é : \n" );

        for(int i = palavra.length()-1; i >= 0; i--)
            System.out.print(palavra.charAt(i));

        leitor.close();


        //alternativa
        String palavra1 = "palavra";
        char[] ordemNormal = palavra1.toCharArray();//[p][a][l][a][v][r][a]

        System.out.println("A palavra \"" + palavra1 + "\" ao contrário é: ");
        for (int i=palavra1.length()-1; i >=0; i--){
            System.out.print(ordemNormal[i]);
        }

        System.out.print("\n");

    }
}
