package observer.patterns;

import java.util.ArrayList;
import java.util.List;

public class BarraNotificacao {
    private List<Notificacao> observadores = new ArrayList<>();

    public void addObservador(Notificacao notificacao){
        observadores.add(notificacao);
    }

    public void removeObservador(Notificacao notificacao){
        observadores.remove(notificacao);
    }

    public void notificar(){
        for (Notificacao notificacao : observadores) {
            notificacao.update("Você tem uma notificação!");
    }
}
}
