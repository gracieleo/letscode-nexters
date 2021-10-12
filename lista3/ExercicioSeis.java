
package br.com.letscode.java.lista3;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        //Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        System.out.println("Palavra digitada:" + palavra);

        char[] novo = new char[palavra.length()];

        for(int i =0; i <= palavra.length() - 1 ; i++){
            novo [i] = palavra.charAt(i);
        }

        for(int i =0; i < palavra.length();i++){
            if( i % 2 != 0){
               char mudanca = novo [i];
               novo[i] = Character.toUpperCase(mudanca);     //[m][A][c][A]
            }
        }
        System.out.println("A palavra com os caracteres na posição ímpar em maiusculo: ");
        System.out.println(novo);

        sc.close();


        //alternativa
        String palavra1 = "FELICIDADE";  //FeLiCiDaDe = fElIcIdAdE
        char[] letrasPalavra = palavra1.toCharArray();
        String estilizado = "";

        for (int i=0; i< palavra1.length(); i++) {
            if (i%2==0) {
                estilizado += Character.toUpperCase(letrasPalavra[i]);
            } else {
                estilizado += Character.toLowerCase(palavra.charAt(i));
            }
        }
        System.out.println(estilizado);

    }
}



