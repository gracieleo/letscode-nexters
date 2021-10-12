package br.com.letscode.java.lista2;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCotacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor da cotação do dólar hoje: ");
        double valorDolar = sc.nextDouble();
        System.out.println("Digite o valor para o qual você gostaria de converter para dolares: ");
        double valorReais = sc.nextDouble();


        double conversao = valorReais/valorDolar;

        System.out.printf("O valor R$%.2f corresponde a $%.2f de acordo com a cotação na data informada.",valorReais, conversao);

        //sistema dá o simbolo correto da moeda
        String eua = numberFormat(Locale.US,conversao);
        Locale locale = new Locale("pt","BR");
        String real = numberFormat(locale,valorReais);
        String cotacao = numberFormat(locale,valorDolar);


        System.out.printf("O valor de %s corresponde a %s (cotação %s)",real,eua,cotacao);


        sc.close();
    }

    public static String numberFormat(Locale locale,Double value){
        return NumberFormat.getCurrencyInstance(locale).format(value);
    }
}
