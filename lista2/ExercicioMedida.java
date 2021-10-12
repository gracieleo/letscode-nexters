
package br.com.letscode.java.lista2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o valor da medida em polegadas: ");
        float polegada = sc.nextFloat();

        final float POLEGADA_PARA_CENTIMETRO = 2.540f;

        float conversao = (float) polegada*POLEGADA_PARA_CENTIMETRO;

        System.out.printf("O valor em polegadas(in) %.2f corresponde a %.2f em centímetros(cm). ",polegada,conversao);

        sc.close();
    }
}
