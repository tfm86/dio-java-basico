public class Resultado {

    public static void main(String[] args) {

        int nota = 8;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado2);

    }

}
