package composite.patterns;

import java.util.ArrayList;
import java.util.List;

public class Arquivo implements Composite{
    private String nomeArquivo;
    private String conteudoArquivo;


    public Arquivo(String nomeArquivo, String conteudoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.conteudoArquivo = conteudoArquivo;
    }

    @Override
    public void exibir() {
        
    }

    @Override
    public String getNome() {
        return nomeArquivo;
    }

}
