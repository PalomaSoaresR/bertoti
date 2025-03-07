package observer.patterns;

import java.util.ArrayList;
import java.util.List;

public class BarraNotificacao {
    private List<Notificacao> observadores = new ArrayList<>();

    public void add(Notificacao notificacao){
        observadores.add(notificacao);
    }

    public void remove(Notificacao notificacao){
        observadores.remove(notificacao);
    }

    public void notificacoes(){
        for (Notificacao notificacao : observadores) {
            notificacao.notificar("Você tem uma notificação!");
    }
}
}
