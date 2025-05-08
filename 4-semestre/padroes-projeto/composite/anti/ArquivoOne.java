package composite.anti;


public class ArquivoOne extends Composite {

    private String nome;
    private String conteudo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
 
    @Override
  
    public void add(Composite composite) {
        throw new UnsupportedOperationException("Operação não suportada.");
    }
    
    
 }
