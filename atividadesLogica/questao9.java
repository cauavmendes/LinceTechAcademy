import java.util.Scanner;

public class questao9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // entrada do texto
        System.out.print("Digite um texto: ");
        String texto = teclado.nextLine().toLowerCase();

        // variáveis de contagem
        int vogais = 0;
        int consoantes = 0;
        int letras = 0;
        int palavras = 0;

        // percorre cada caractere do texto
        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            // verifica se é letra
            if (Character.isLetter(letra)) {

                letras++;

                // verifica se é vogal
                if (letra == 'a' || letra == 'e' || letra == 'i'
                        || letra == 'o' || letra == 'u') {

                    vogais++;

                } else {

                    // caso não seja vogal, é consoante
                    consoantes++;
                }
            }
        }

        // remove espaços extras e divide as palavras
        String[] listaPalavras = texto.trim().split("\\s+");

        // verifica se o texto não está vazio
        if (texto.trim().isEmpty()) {
            palavras = 0;
        } else {
            palavras = listaPalavras.length;
        }

        // exibe os resultados
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);
        System.out.println("Quantidade total de letras: " + letras);
        System.out.println("Quantidade de palavras: " + palavras);

        teclado.close();
    }
}