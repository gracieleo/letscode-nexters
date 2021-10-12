package br.com.letscode.java.lista2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        System.out.println("Informe dois valores para calcular quatro operações");
        System.out.println("Informe o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        int n2 = sc.nextInt();


        System.out.printf("Soma de %d+%d = %d%n ",n1,n2,n1+n2);
        System.out.printf("Subtração de %d-%d = %d%n ",n1,n2,n1-n2);
        System.out.printf("Multiplicação de %dx%d = %d%n ",n1,n2,n1*n2);


        //verificar divisão por zero
        if(n2==0){
            System.out.println("Esta é uma divisão por zero");
        }else{
            double divisao = (double) n1/n2;
            System.out.printf("Divisão de %d/%d = %.2f%n",n1,n2,divisao);
        }
        sc.close();
    }
}
