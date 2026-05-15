import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // entrada dos valores
        System.out.print("Digite o valor de A: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = teclado.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = teclado.nextDouble();

        // cálculo do delta
        double delta = (b * b) - (4 * a * c);

        // verifica se o delta é negativo
        if (delta < 0) {

            System.out.println("A equação não possui raízes reais.");

        } else {

            // cálculo das raízes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            // exibe os resultados
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

        teclado.close();
    }
}