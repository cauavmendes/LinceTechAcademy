import java.util.Scanner;

public class questao8 {
    public static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = teclado.nextInt();

        // calculo da tabuada de 1 ate 9
        for (int i = 1; i <= 9; i++){
            int resultado = num * i;

            // exibe a tabuada
            System.out.println(resultado);
        }
        
        teclado.close();
    }
}
