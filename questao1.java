import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite um número decimal: ");
        double num1 = teclado.nextDouble();

        System.out.print("Digite outro número decimal: ");
        double num2 = teclado.nextDouble();

        double maior, menor;

        // Define qual é maior e qual é menor
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2; 
            menor = num1;
        }

        // Verifica divisão por 0
        if (menor == 0) {
            System.out.println("Não é possivel dividir por 0");
        } else {
            double resultado = maior / menor;
            System.out.println("O resultado é: " + resultado);
        }
        
        teclado.close();
    }
}