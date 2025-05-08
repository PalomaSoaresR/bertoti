package composite.patterns;

public class Arquivo1 implements Composite {
    private String nomeArquivo;
    private String conteudoArquivo;

    public Arquivo1(String nomeArquivo, String conteudoArquivo) {
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
