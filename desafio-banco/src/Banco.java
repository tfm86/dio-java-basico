import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

    private List<Conta> listaConta;

    public Banco() {

        listaConta = new ArrayList<>();
    }

    public void addConta(Conta conta) {

        if (conta == null) {
            throw new IllegalArgumentException("Conta não pode ser nula.");
        } else {
            listaConta.add(conta);
        }

    }

    public List<Conta> lista() {
        return Collections.unmodifiableList(listaConta); // Retorna uma lista imutável para evitar modificações externas
    }

}
