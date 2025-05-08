package composite.patterns;

public class TesteComposite {
    public static void main(String[] args) {
        Arquivo1 arq = new Arquivo1("arquivo", "conteúdo");
        arq.exibir();
        System.out.println(arq.getNome());
        Pasta pasta = new Pasta("Pasta", "Conteúdo pasta");
        Arquivo1 subPasta = new Arquivo1("subpasta", "subpasta");
        pasta.exibir();
        System.out.println(pasta.getNome());
        pasta.add(subPasta);
        pasta.getFilhos();

    }
}
