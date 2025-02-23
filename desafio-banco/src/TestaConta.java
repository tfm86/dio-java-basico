public class TestaConta {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Tiago");

        Cliente c2 = new Cliente();
        c2.setNome("Maria");

        ContaCorrente cc1 = new ContaCorrente(c1);
        ContaPoupanca cp1 = new ContaPoupanca(c1);

        ContaCorrente cc2 = new ContaCorrente(c2);
        ContaPoupanca cp2 = new ContaPoupanca(c2);

        OperadorConta op = new OperadorConta();

        op.depositar(1000, cc1);
        op.transferir(250, cc1, cp1);

        op.extratoConta(cc1);
        op.extratoConta(cp1);

        op.transferir(250, cc1, cc2);
        System.err.println("=============================================");

        op.extratoConta(cc1);
        op.extratoConta(cc2);

    }

}
