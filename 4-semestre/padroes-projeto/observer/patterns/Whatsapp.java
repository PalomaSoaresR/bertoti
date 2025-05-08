package observer.patterns;

public class Whatsapp implements Notificacao{
    
    public Whatsapp(){};

    @Override
    public void update(String mensagem) {
System.out.println("Whatsapp: "+ mensagem);    }
}
