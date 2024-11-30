package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        imprimirSelecionados();

    }

    static void imprimirSelecionados() {

        String[] canditados = { "FELIPE", "JOSE", "JULIA", "MONICA", "JULIO", "MIRELA" };

        for (int i = 0; i < canditados.length; i++) {
            System.out.println("O canditado de ñ " + i + " é " + canditados[i]);
        }

        for (String cantidado : canditados) {
            System.out.println("Canditado é " + cantidado);
        }

    }

    static void selecaoCantidatos() {

        String[] canditados = { "FELIPE", "JOSE", "JULIA", "MONICA", "JULIO", "MIRELA", "LUIZ", "TIAGO", "AUGUSTO",
                "DANIELA" };
        int canditadosSelecionados = 0;
        int canditadoAtual = 0;
        double salarioBase = 2000.0;

        while (canditadosSelecionados < 5 && canditadoAtual < canditados.length) {
            String canditado = canditados[canditadoAtual];
            double salarioPrentendido = valorPretendido();

            System.out.println("O canditado " + canditado + " solicitou o valor de " + salarioPrentendido);

            if (salarioBase >= salarioPrentendido) {
                System.out.println("O canditado " + canditado + " foi selecionado para vaga");
                canditadosSelecionados++;
            }

            canditadoAtual++;

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCanditado(double salario) {
        double salarioBase = 2000.0;
        if (salarioBase > salario) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salario) {
            System.out.println("LIGAR PARA O CANDITADO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDITADOS");
        }

    }

}