import br.com.fiap.vetoresprimitivos.models.*;

public class Main {
    public static void main(String[] args) {
        ListaItens lista = new ListaItens(3);

        Item item1 = new Item("Item A", 1001, 50.0);
        Item item2 = new Item("Item B", 1002, 30.0);
        Item item3 = new Item("Item C", 1003, 20.0);
        Item item4 = new Item("Item D", 1004, 25.0);

        System.out.println("- - - - - - - - - - -");
        System.out.println("Adicionar:");
        System.out.println();
        lista.adicionar(item1);
        lista.adicionar(item2);
        lista.adicionar(item3);
        lista.listar();

        System.out.println("- - - - - - - - - - -");
        System.out.println("Buscar:");
        System.out.println();
        lista.buscar("Item C");
        lista.listar();

        System.out.println("- - - - - - - - - - -");
        System.out.println("Atualizar:");
        System.out.println();
        lista.atualizar(1, item4);
        lista.listar();

        System.out.println("- - - - - - - - - - -");
        System.out.println("Remover:");
        System.out.println();
        lista.remover(0);
        lista.listar();
    }
}