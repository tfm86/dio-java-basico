public abstract class Conta implements OperConta {

    private static final int AGENCIA_ID = 1;
    private static int SEQNUMERO = 30;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_ID;
        this.numero = SEQNUMERO++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;

    }

    @Override
    public void imprimieExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));s

    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
