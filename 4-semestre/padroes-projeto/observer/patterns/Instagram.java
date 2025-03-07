package observer.patterns;

public class Instagram implements Notificacao {


    public Instagram() {
    }


    @Override
    public void notificar(String mensagem) {
        System.out.println("Instagram: "+ mensagem);    }
    }

