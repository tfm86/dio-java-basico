import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {

        // String[] nomes = { "USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA",
        // "UNIOESTE", "URI", "UFG" };
        String[] nomes = new String[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            nomes[i] = sc.nextLine();

            if (i == 2) {
                System.out.println(nomes[2]);
            } else if (i == 6) {
                System.out.println(nomes[6]);
            } else if (i == 8) {
                System.out.println(nomes[8]);
            }

        }

    }
}
