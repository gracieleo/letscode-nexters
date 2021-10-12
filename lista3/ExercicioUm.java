
package br.com.letscode.java.lista3;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        //Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras.
        //Ao final da entrada dos 5 itens, exiba a lista completa.

        Scanner sc = new Scanner(System.in);
        String [] carrinhoCompras  = new String [5];
        System.out.println("Digite o nome de 5 frutas que serão armazenas em seu carrinho:");

        for(int i =0;i<carrinhoCompras.length;i++){
            System.out.print("Fruta " + (i+1) + ": ");
            carrinhoCompras[i] = sc.next();
        }
        sc.close();
        for (String fruta : carrinhoCompras) {
            System.out.println(fruta);
        }
    }
}


