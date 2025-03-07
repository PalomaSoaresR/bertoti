package observer.patterns;

public class Whatsapp implements Notificacao{
    
    public Whatsapp(){};

    @Override
    public void notificar(String mensagem) {
System.out.println("Whatsapp: "+ mensagem);    }
}
