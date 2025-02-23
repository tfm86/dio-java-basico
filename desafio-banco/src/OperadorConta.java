public class OperadorConta implements Operador {

    @Override
    public void sacar(double valor, Conta conta) {
        if (valor > 0 && conta.getSaldo() >= valor) {
            conta.saldo = conta.saldo - valor;
        } else {
            System.out.println("==== Saldo insuficiente ou valor inválido ====");
        }
    }

    @Override
    public void transferir(double valor, Conta contaOrigem, Conta contaDestino) {
        if (valor > 0 && contaOrigem.saldo >= valor) {
            contaOrigem.saldo = contaOrigem.saldo - valor;
            contaDestino.saldo = contaDestino.saldo + valor;
        } else {
            System.out.println("==== Saldo insuficiente ou valor inválido ====");
        }
    }

    @Override
    public void depositar(double valor, Conta contaDestino) {
        if (valor > 0) {
            contaDestino.saldo = contaDestino.saldo + valor;
        } else {
            System.out.println("==== Valor inválido para depósito ====");
        }
    }

    @Override
    public void extratoConta(Conta conta) {
        System.out.println("\n========= EXTRATO BANCÁRIO =========");
        System.out.printf("Extrato : %s%n", conta.getClass().getName());
        System.out.printf("Titular : %s%n", conta.getCliente().getNome());
        System.out.printf("Agência : %d%n", conta.getAgencia());
        System.out.printf("Número  : %d%n", conta.getNumero());
        System.out.printf("Saldo   : R$ %.2f%n", conta.getSaldo());
        System.out.println("=====================================\n");
    }

}
