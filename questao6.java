import java.util.Scanner;

public class questao6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // entrada dos catetos
        System.out.print("Digite o primeiro cateto: ");
        double cateto1 = teclado.nextDouble();

        System.out.print("Digite o segundo cateto: ");
        double cateto2 = teclado.nextDouble();

        // cálculo da hipotenusa
        double hipotenusa = Math.sqrt(
                (cateto1 * cateto1) +
                        (cateto2 * cateto2)
        );

        // exibe o resultado
        System.out.println("Hipotenusa = " + hipotenusa);

        teclado.close();
    }
}