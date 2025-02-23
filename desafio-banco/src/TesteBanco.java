public class TesteBanco {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Tiago");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maite");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta cp1 = new ContaPoupanca(cliente1);

        Conta cc2 = new ContaCorrente(cliente2);
        Conta cp2 = new ContaPoupanca(cliente2);

        OperadorConta op = new OperadorConta();

        op.depositar(1000, cc1);
        op.transferir(350, cc1, cp1);

        op.depositar(2000, cc2);
        op.transferir(700, cc2, cp2);

        banco.addConta(cc1);
        banco.addConta(cp1);
        banco.addConta(cc2);
        banco.addConta(cp2);

        for (Conta lista : banco.lista()) {
            System.out.println(lista.getClass().getName());
        }

        for (Conta lista : banco.lista()) {
            System.out
                    .println(String.format("Nome: %s\n" + "Conta: %s\n" + "Saldo: %.2f\n", lista.getCliente().getNome(),
                            lista.getClass().getName(), lista.getSaldo()));
        }

        op.sacar(50, cp1);

        for (Conta lista : banco.lista()) {
            System.out
                    .println(String.format("Nome: %s\n" + "Conta: %s\n" + "Saldo: %.2f\n", lista.getCliente().getNome(),
                            lista.getClass().getName(), lista.getSaldo()));
        }

    }

}
