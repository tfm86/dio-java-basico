public enum Estados {

    BELEM("PA", "Belém"),
    MARANHAO("MA", "Maranhão");

    private String nome;
    private String sigla;

    private Estados(String sigla, String nome) {

        this.sigla = sigla;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public String getSigla() {
        return sigla;
    }

}
