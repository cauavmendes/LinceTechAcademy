import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num; 

        System.out.println("Digite 5 números: ");
        for (int i = 1; i <= 5; i++){
            
            System.out.println("Número " + i + ": ");
            num = teclado.nextInt();

            // Verifica se o número é ímpar
            if (num % 2 != 0) {
                System.out.println("Ímpar: " + num);
            }
        }
        
        teclado.close();

    }
}
