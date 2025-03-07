package composite.anti;

import java.util.List;

public interface Composite {
    void exibir();
    String getNome();
    void add(Composite c);
    void excluir(Composite c);
    List<Composite> getFilhos();

}
