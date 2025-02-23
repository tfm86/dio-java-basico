public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void renderJuros(double taxa) {
        if (taxa > 0) {
            this.saldo += this.saldo * taxa;
        } else {
            System.out.println("==== Taxa de juros inválida ====");
        }
    }

}
