public class OperadorConta implements Operador {

    @Override
    public void sacar(double valor, Conta conta) {
        conta.saldo = conta.saldo - valor;
    }

    @Override
    public void transferir(double valor, Conta contaOrigem, Conta contaDestino) {
        if (contaOrigem.saldo >= valor) {
            contaOrigem.saldo = contaOrigem.saldo - valor;
            contaDestino.saldo = contaDestino.saldo + valor;
        } else {
            System.out.println("====Saldo insuficiente====");
        }
    }

    @Override
    public void depositar(double valor, Conta contaDestino) {
        contaDestino.saldo = contaDestino.saldo + valor;
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
