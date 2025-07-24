public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // AparelhoTelefonico
        iphone.ligar("4399999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // NavegadorInternet
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("musica");
    }
}
