import strategy.patterns.Adulto;
import strategy.patterns.Bebe;

public class Teste {
    public static void main(String[] args) {
        Bebe bebe = new Bebe();
        Adulto adulto = new Adulto();
        adulto.locomocao();
        bebe.locomocao();

    }

}
