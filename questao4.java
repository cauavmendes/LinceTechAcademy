import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // faz a entrada com os números
        System.out.println("digite um número: ");
        double num1 = teclado.nextDouble();

        System.out.println("digite outro número: ");
        double num2 = teclado.nextDouble();

        // pega o maior entre os dois números
        double mmc = Math.max(num1, num2);

        // verifica se o número atual é divisível pelos dois números
        while (true) {
            if (mmc % num1 == 0 && mmc % num2 == 0){
                break;
            }
            // incrementa 1 no valor do mmc para continuar testando
            mmc++;
        }
        System.out.println("MMC: " + mmc);
        
        teclado.close();
    }
}