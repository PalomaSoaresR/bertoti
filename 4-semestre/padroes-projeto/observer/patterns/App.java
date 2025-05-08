package observer.patterns;

public class App {
    public static void main(String[] args) {
        Instagram insta = new Instagram();
        Whatsapp whats = new Whatsapp();
        BarraNotificacao barra = new BarraNotificacao();
        barra.addObservador(whats);
        barra.addObservador(insta);
        barra.notificar();

    }

}
