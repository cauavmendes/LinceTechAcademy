import java.util.Scanner;

public class questao7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // entrada do número
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        // variável que armazenará o resultado do fatorial
        int fatorial = 1;

        // cálculo do fatorial
        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        // exibe o resultado
        System.out.println("Fatorial = " + fatorial);

        teclado.close();
    }
}