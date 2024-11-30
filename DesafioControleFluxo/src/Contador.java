import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int primeiro = terminal.nextInt();
        System.out.println("Informe o segundo número:");
        int segundo = terminal.nextInt();

        try {

            contar(primeiro, segundo);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private static void contar(int primeiro, int segundo) throws ParametrosInvalidosException {

        if (primeiro < segundo) {
            int contagem = segundo - primeiro;

        }

        // throw new UnsupportedOperationException("Unimplemented method 'contar'");
    }

}