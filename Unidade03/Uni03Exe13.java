import java.util.Scanner;

public class Uni03Exe13 {

    public static void main(String[] args) {

        /*
         * Análise: O valor do azulejo é R$12.50, m² = 9 azulejos
         * Entrada: altura, comprimento
         * Saída: valorFinal
         * Processo: valorMetroQuadrado = 9 * 12.50,
         * valorFinal = (altura * comprimento) * valorMetroQuadrado
         * Fluxograma:
         */

        Scanner k = new Scanner(System.in);

        System.out.print("Indique a altura: ");
        float altura = k.nextFloat();
        System.out.print("Indique o comprimento: ");
        float comprimento = k.nextFloat();

        float valorMetroQuadrado = 9f * 12.50f;

        float valorFinal = (comprimento * altura) * valorMetroQuadrado;

        System.out.println("O valor final é R$" + valorFinal);

        k.close();
    }

}
