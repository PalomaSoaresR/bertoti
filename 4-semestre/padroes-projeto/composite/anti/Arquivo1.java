package composite.anti;

import java.util.ArrayList;
import java.util.List;

public class Arquivo1 implements Composite {

    private String nomeArquivo;
    private String conteudoArquivo;
    private List<Composite> filhos = new ArrayList<>();


    public Arquivo1(String nomeArquivo, String conteudoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.conteudoArquivo = conteudoArquivo;
    }


    @Override
    public void exibir() {
        System.out.println(conteudoArquivo);
    }

    @Override
    public String getNome() {
        return nomeArquivo;
    }


    @Override
    public void add(Composite composite) {
        filhos.add(null);

    }

    @Override
    public void excluir(Composite composite) {
        filhos.remove(0);

    }

    @Override
    public List<Composite> getFilhos() {
        return filhos;
    }
}
