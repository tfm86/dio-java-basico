import java.util.*;

public class Problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Informar qtd de jogos:");
        int n = sc.nextInt();
        String j1, j2;

        for (int i = 0; i < n; i++) {

            // System.out.print("Informar o J1:");
            j1 = sc.next();
            // System.out.print("Informar o J2:");
            j2 = sc.next();

            if (j1.equalsIgnoreCase("ataque") && j2.equalsIgnoreCase("ataque")) {
                System.out.println("Aniquilacao mutua");

            } else if (j1.equalsIgnoreCase("ataque") && j2.equalsIgnoreCase("pedra")) {
                System.out.println("Jogador 1 venceu");

            } else if (j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("ataque")) {
                System.out.println("Jogador 2 venceu");

            } else if (j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("papel")) {
                System.out.println("Ambos venceram");

            } else if (j1.equalsIgnoreCase("pedra") && j2.equalsIgnoreCase("papel")) {
                System.out.println("Jogador 1 venceu");

            } else if (j1.equalsIgnoreCase("pedra") && j2.equalsIgnoreCase("pedra")) {
                System.out.println("Sem ganhador");

            }

        }

    }

}
