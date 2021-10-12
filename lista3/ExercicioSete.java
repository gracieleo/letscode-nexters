
package br.com.letscode.java.lista3;

public class ExercicioSete {
    public static void main(String[] args) {

        //Escreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo,
        //o mais velho e qual a média de idade.

        String[] nomes = {"Joao", "Jose", "Jota", "Junior", "Janio"};
        int[] idades = {30, 34, 25, 28, 20};
        int maisNovoIndice = 0, maisVelhoIndice = 0;
        int somatorio = 0;

        for (int i=0; i< nomes.length; i++) {
            if (idades[i] > idades[maisVelhoIndice]) {
                maisVelhoIndice = i;
            }
            if (idades[i] < idades[maisNovoIndice]) {
                maisNovoIndice = i;
            }
            somatorio += idades[i];
        }

        System.out.println("O mais NOVO é " + nomes[maisNovoIndice]);
        System.out.println("O mais VELHO é " + nomes[maisVelhoIndice]);
        System.out.println("A média de idade é " + somatorio/nomes.length);


        //uso de for convencional - controlar o acesso de forma sequencial
        //for enhanced - exibir percorrer todos valores do array, sem considerar posições

    }
}

