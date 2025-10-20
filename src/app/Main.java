package app;

import iphone.device.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando funcionalidades do telefone
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades do reprodutor musical
        meuIphone.selecionarMusica("Innerbloom - RÜFÜS DU SOL");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando funcionalidades do navegador
        meuIphone.exibirPagina("www.instagram.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
