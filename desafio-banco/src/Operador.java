public interface Operador {

    void sacar(double valor, Conta conta);

    void transferir(double valor, Conta contaOrigem, Conta contaDestino);

    void depositar(double valor, Conta contaDestino);

    void extratoConta(Conta conta);

}
