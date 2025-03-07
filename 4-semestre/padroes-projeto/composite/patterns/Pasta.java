package composite.patterns;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Composite {
      private String nomePasta;
    private String conteudoPasta;
    private List<Composite> filhos = new ArrayList<>();

    public Pasta(String nomePasta, String conteudoPasta, List<Composite> filhos) {
        this.nomePasta = nomePasta;
        this.conteudoPasta = conteudoPasta;
        this.filhos = filhos;
    }

    @Override
    public void exibir() {
        
    }

 @Override
 public String getNome() {
     return nomePasta;
 }

 public void add(Composite composite) {
     filhos.add(null);

 }

 
 public void excluir(Composite composite) {
     filhos.remove(0);

 }

 
 public List<Composite> getFilhos() {
     return filhos;
 }

    
}
