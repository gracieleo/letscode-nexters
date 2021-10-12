
package br.com.letscode.java.lista3;


public class ExercicioCinco {
    public static void main(String[] args) {

        //Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
        //Ao final, informe qual o nome mais longo presente na lista.

        String [] convidados = {"Maria", "João", "Marinalva", "Tadeu","Rose"};
        String maiorNome = convidados[0];

        //exibe a lista
        System.out.println("Lista de convidados: ");
        for(int i = 0;i < convidados.length;i++){
            System.out.println(i + " -  " + convidados[i]);
        }

        //exibe o maior nome
        for(String nome : convidados) {
            if(nome.length() > maiorNome.length()) {
                maiorNome = nome;
            }
        }
        System.out.println("O maior nome dentre os convidados é o de " + maiorNome);
    }

}






