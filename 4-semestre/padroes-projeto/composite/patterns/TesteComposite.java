import composite.anti.Pasta;
import composite.patterns.Arquivo;

public class TesteComposite {
    public static void main(String[] args) {
        Arquivo arq = new Arquivo("arquivo", "conteúdo");
        arq.exibir();
        System.out.println(arq.getNome());
        Pasta pasta = new Pasta("Pasta", "Conteúdo pasta");
        Pasta subPasta = new Pasta("subpasta", "subpasta");
        pasta.exibir();
        System.out.println(pasta.getNome());
        pasta.add(subPasta);
        pasta.getFilhos();

    }
}
