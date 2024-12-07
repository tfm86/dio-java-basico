public class Sistema {
    public static void main(String[] args) {

        for (Estados e : Estados.values()) {
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }

        Estados e = Estados.BELEM;

        System.out.println(e.getSigla());

    }
}
