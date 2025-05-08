package composite.patterns;

public class Arquivo2 implements Composite {
    private String nomeArquivo;
    private String conteudoArquivo;

    public Arquivo2(String nomeArquivo, String conteudoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.conteudoArquivo = conteudoArquivo;
    }

    @Override
    public void exibir() {
        System.out.println(conteudoArquivo);
        ;
    }

    @Override
    public String getNome() {
        return nomeArquivo;
    }

}
