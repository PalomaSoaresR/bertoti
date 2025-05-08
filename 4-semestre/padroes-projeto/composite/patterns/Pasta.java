package composite.patterns;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Composite {
    private String nomePasta;
    private String conteudoPasta;
    private List<Composite> filhos = new ArrayList<>();

    public Pasta(String nomePasta, String conteudoPasta) {
        this.nomePasta = nomePasta;
        this.conteudoPasta = conteudoPasta;
    }

    @Override
    public void exibir() {
        System.out.println(conteudoPasta);
    }

    @Override
    public String getNome() {
        return nomePasta;
    }

    public void add(Composite composite) {
        filhos.add(composite);
    }

    public void excluir(Composite composite) {
        filhos.remove(composite);
    }

    public List<Composite> getFilhos() {
        return filhos;
    }

}
