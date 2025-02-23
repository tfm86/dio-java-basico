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

        System.out.println(String.format("Extrato: %s", conta.getClass().getName()));
        System.out.println(String.format("Titular: %s", conta.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", conta.agencia));
        System.out.println(String.format("Numero: %d", conta.numero));
        System.out.println(String.format("Saldo: %.2f", conta.saldo));
    }

}
