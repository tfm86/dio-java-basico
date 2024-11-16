import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       
        System.out.print("Informe seu nome:");
        String NomeCliente = in.nextLine();

        System.out.print("Informe Agência:");
        String Agencia = in.nextLine();

        System.out.print("Informe Conta:");
        String Numero = in.nextLine();

        System.out.print("Informe Saldo:");
        Double Saldo = in.nextDouble();
    
        System.out.print("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
        +Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque.");

    }
}
