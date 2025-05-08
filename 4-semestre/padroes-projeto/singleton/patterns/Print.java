package singleton.patterns;

public class Print {
    private static Print instance;

    private Print() {
        System.out.println("Gerenciador de impressão iniciado...");
    }

    public static Print getInstance() {
        if (instance == null) {
            instance = new Print();
        }
        return instance;
    }

    public void imprimirDocumento(String documento) {
        System.out.println("Imprimindo: " + documento);
    }
}

