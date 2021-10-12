package br.com.letscode.java.lista2;

import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro de 1 a 10 para ver a sua tabuada.");
        int n1 = sc.nextInt();

        System.out.println("Tabuada do número " + n1 + ":");
        System.out.printf("%d x 1 = %d%n",n1,n1*1);
        System.out.printf("%d x 2 = %d%n ",n1,n1*2);
        System.out.printf("%d x 3 = %d%n ",n1,n1*3);
        System.out.printf("%d x 4 = %d%n ",n1,n1*4);
        System.out.printf("%d x 5 = %d%n ",n1,n1*5);
        System.out.printf("%d x 6 = %d%n ",n1,n1*6);
        System.out.printf("%d x 7 = %d%n ",n1,n1*7);
        System.out.printf("%d x 8 = %d%n ",n1,n1*8);
        System.out.printf("%d x 9 = %d%n ",n1,n1*9);
        System.out.printf("%d x 10 = %d%n ",n1,n1*10);

        //alternativa
        System.out.println("*******************");
        for (int i = 1; i<= 10; i++){
            System.out.printf("%d x %d = %d%n",n1,i,n1*i);
        }

        sc.close();
    }
}
