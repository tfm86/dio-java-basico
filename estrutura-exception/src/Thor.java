import java.util.Scanner;

public class Thor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int n;

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            nome = sc.next();
            n = sc.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

        }

    }
}
