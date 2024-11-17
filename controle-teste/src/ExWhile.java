import java.util.concurrent.ThreadLocalRandom;

public class ExWhile {
    public static void main(String[] args) {

        double mesada = 20.00;

        while (mesada > 0) {

            double valorDoce = valorDoceAleatorio();

            if (valorDoce > mesada) {
                System.out.println("Mesada " + mesada + " insuficiente para comprar o doce " + valorDoce);

            }

            else if (mesada > valorDoce) {
                System.out.println("Valor do doce: " + valorDoce + " add no carrinho");

            }

            mesada = mesada - valorDoce;

        }

    }

    private static double valorDoceAleatorio() {

        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
