import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = teclado.nextInt();

        // Subtração
        int resultado = num1 - num2;

        // Valor absoluto
        int valorAbsoluto = Math.abs(resultado);

        // Saída
        System.out.println("Valor absoluto da subtração: " + valorAbsoluto);

        teclado.close();
    }
}