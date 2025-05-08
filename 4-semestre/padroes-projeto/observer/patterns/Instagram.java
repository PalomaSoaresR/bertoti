package observer.patterns;

public class Instagram implements Notificacao {


    public Instagram() {
    }


    @Override
    public void update(String mensagem) {
        System.out.println("Instagram: "+ mensagem);    }
    }

