public abstract class Conta {

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
        this.saldo = 0.0;
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

    public Cliente getCliente() {
        return cliente;
    }

}
