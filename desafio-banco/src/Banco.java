import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> listaConta;

    public Banco() {

        listaConta = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        listaConta.add(conta);

    }

    public List<Conta> lista() {
        return listaConta;
    }

}
