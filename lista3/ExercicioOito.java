package br.com.letscode.java.lista3;

public class ExercicioOito {
    public static void main(String[] args) {

        //Escreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e ao final informa
        //se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).

        String[] nomes = {"Maria", "Jose", "Ana", "Juliana", "Amanda"};
        double[] alturas = {1.60, 1.70, 1.90, 1.82, 1.68};
        double[] pesos = {92, 70, 60, 75, 48};

        // Maria está fora do peso ideal com imc = 35.94
        // Ana está fora do peso ideal com imc = 16.62
        // Amanda está fora do peso ideal com imc = 17.01

        for (int i = 0; i < nomes.length; i++) {
            double imc = pesos[i] / Math.pow(alturas[i], 2);
            if (imc < 18.5 || imc > 25) {
                System.out.printf("%s está fora do peso ideal com imc = %.2f.%n", nomes[i], imc);
            }
        }

    }
}

