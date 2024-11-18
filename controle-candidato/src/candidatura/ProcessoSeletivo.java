package candidatura;

public class ProcessoSeletivo {

    public static void main(String[] args) {

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