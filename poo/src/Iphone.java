public class Iphone implements ReproducaoMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos de ReprodutorMusical

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausa() {
        System.out.println("Música pausada.");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);

    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);

    }

    @Override
    public void adiconarNovaAba() {
        System.out.println("Nova aba adicionada.");

    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        // Testando funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.pausa();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando funcionalidades do aparelho telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades do navegador
        meuIphone.exibirPagina("www.apple.com");
        meuIphone.adiconarNovaAba();
        meuIphone.atualizar();

    }

}