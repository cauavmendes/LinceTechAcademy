import java.util.Arrays;
import java.util.Scanner;

public class questao10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // entrada da quantidade de números
        System.out.print("Quantos números deseja digitar? ");
        int quantidade = teclado.nextInt();

        // cria o vetor para armazenar os números
        int[] numeros = new int[quantidade];

        // variáveis de cálculo
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;

        // entrada dos números
        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite um número: ");
            numeros[i] = teclado.nextInt();

            soma += numeros[i];

            // verifica se o número é par ou ímpar
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            } else {
                somaImpares += numeros[i];
            }
        }

        // ordena os números em ordem crescente
        Arrays.sort(numeros);

        // exibe os números em ordem crescente
        System.out.println("\nOrdem crescente:");

        for (int i = 0; i < quantidade; i++) {
            System.out.println(numeros[i]);
        }

        // exibe os números em ordem decrescente
        System.out.println("\nOrdem decrescente:");

        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // obtém o menor e o maior número
        int menor = numeros[0];
        int maior = numeros[quantidade - 1];

        // calcula a média
        double media = (double) soma / quantidade;

        // exibe os resultados
        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        teclado.close();
    }
}