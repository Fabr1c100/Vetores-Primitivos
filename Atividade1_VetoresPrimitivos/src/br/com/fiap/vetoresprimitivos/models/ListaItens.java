package br.com.fiap.vetoresprimitivos.models;

public class ListaItens {
    private Item[] listaDeItens;
    private int contadorIndex;

    public ListaItens(int tamanho) {
        listaDeItens = new Item[tamanho];
        contadorIndex = 0;
    }

    public void adicionar(Item item) {
        if (contadorIndex < listaDeItens.length) {
            listaDeItens[contadorIndex] = item;
            contadorIndex++;
        } else {
            System.out.println("Sua lista já está cheia. Não foi possível adicionar mais um item!");
        }
    }

    public boolean buscar(String nome) {
        for (int i = 0; i < listaDeItens.length; i++) {
            if (listaDeItens[i] != null && listaDeItens[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("O item " + nome + " foi encontrado no índice: " + i);
                return true;
            }
        }

        System.out.println("Item inexistente na lista!");
        return false;
    }

    public void atualizar(int index, Item item) {
        if (index >= 0 && index < contadorIndex) {
            listaDeItens[index] = item;
            System.out.println("Item no índice " + index + " foi atualizado!");
        } else {
            System.out.println("Este índice é inválido!");
        }
    }

    public void remover(int index) {
        if (index >= 0 && index < contadorIndex) {
            for (int i = index; i < contadorIndex - 1; i++) {
                listaDeItens[i] = listaDeItens[i + 1];
            }
            listaDeItens[contadorIndex - 1] = null;
            contadorIndex--;
            System.out.println("Item removido!");
        } else {
            System.out.println("Este índice é inválido!");
        }
    }

    public void listar() {
        for (int i = 0; i < contadorIndex; i++) {
            System.out.println("Índice " + i + ": " + listaDeItens[i]);
        }
    }
}