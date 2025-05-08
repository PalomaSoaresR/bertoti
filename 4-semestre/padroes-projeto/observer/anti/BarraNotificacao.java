package observer.anti;

public class BarraNotificacao {
    private Instagram instagram;
    private WhatsApp whatsapp;

    public BarraNotificacao(Instagram instagram, WhatsApp whatsapp) {
        this.instagram = instagram;
        this.whatsapp = whatsapp;
    }

    public void notificar(String mensagem) {
        instagram.notificarInsta(mensagem);
        whatsapp.notificarWhats(mensagem);
    }
}
