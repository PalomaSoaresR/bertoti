package singleton.patterns;

public class Teste {
        public static void main(String[] args) {
            Print gerente1 = Print.getInstance();
            gerente1.imprimirDocumento("Relatório de Vendas.pdf");
    
            Print gerente2 = Print.getInstance();
            gerente2.imprimirDocumento("Resumo Financeiro.xlsx");
    
            System.out.println("Mesma instância? " + (gerente1 == gerente2));
        }
    }

