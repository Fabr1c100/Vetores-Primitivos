# Vetores-Primitivos

Este projeto implementa um controle básico de um vetor de itens, com operações para adicionar, buscar, atualizar, remover e listar itens. A implementação foi feita utilizando arrays em Java, sem o uso de coleções como `ArrayList` ou outras.

## Estrutura do Projeto

- **Item.java**: Classe que representa um item, com atributos de nome, código e preço.
- **ListaItens.java**: Classe que gerencia um array de objetos `Item`, fornecendo métodos para adicionar, buscar, atualizar, remover e listar os itens.
- **Main.java**: Classe principal para testar as funcionalidades implementadas.

## Como Executar

1. Compile as classes Java utilizando o comando:
    ```bash
    javac br/com/exemplo/models/Item.java br/com/exemplo/models/ListaItens.java Main.java
    ```

2. Execute a classe principal:
    ```bash
    java Main
    ```

## Funcionalidades

- **adicionar(Item item)**: Adiciona um item ao vetor, caso haja espaço disponível.
- **buscar(String nome)**: Busca por um item no vetor pelo nome e retorna a posição caso encontrado.
- **atualizar(int index, Item item)**: Atualiza o item na posição especificada.
- **remover(int index)**: Remove o item na posição especificada e reorganiza os itens restantes.
- **listar()**: Lista todos os itens presentes no vetor.

## Perguntas e Respostas

### 5.1 - Caso seja necessário alterar o tamanho do vetor, como isso pode ser feito? Se o código entregue não suporta essa alteração, liste as melhorias necessárias para que a alteração seja possível.

**Resposta:** Para alterar o tamanho do vetor, seria necessário criar um novo vetor com o novo tamanho desejado, copiar todos os elementos do vetor original para o novo vetor, e então substituir o vetor antigo pelo novo. Isso pode ser feito manualmente dentro da classe `ListaItens`. A seguir está uma sugestão de melhoria:

Adicionar um método `redimensionar(int novoTamanho)` dentro da classe `ListaItens`:

```java
public void redimensionar(int novoTamanho) {
    Item[] novoVetor = new Item[novoTamanho];
    for (int i = 0; i < Math.min(listaDeItens.length, novoTamanho); i++) {
        novoVetor[i] = listaDeItens[i];
    }
    listaDeItens = novoVetor;
}
