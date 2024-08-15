# Vetores-Primitivos

Este projeto implementa um controle básico de um vetor de itens, com operações para adicionar, buscar, atualizar, remover e listar itens.

## Estrutura do Projeto

- **Item.java**: Classe que representa um item, com atributos de nome, código e preço.
- **ListaItens.java**: Classe que gerencia um array de objetos `Item`, fornecendo métodos para adicionar, buscar, atualizar, remover e listar os itens.
- **Main.java**: Classe principal para testar as funcionalidades implementadas.

## Como Executar

1. Execute a classe principal:
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

**Resposta:** Para alterar o tamanho do vetor, seria necessário criar um novo vetor com o novo tamanho desejado, copiar todos os elementos do vetor original para o novo vetor, e então substituir o vetor antigo pelo novo. Isso pode ser feito dentro da classe `ListaItens`. Exemplo:

Adicionar um método `redimensionar(int novoTamanho)` dentro da classe `ListaItens`:

```java
public void redimensionar(int novoTamanho) {
    Item[] novoVetor = new Item[novoTamanho];
    for (int i = 0; i < Math.min(listaDeItens.length, novoTamanho); i++) {
        novoVetor[i] = listaDeItens[i];
    }
    listaDeItens = novoVetor;
}
```

### 5.2 - O que acontecerá caso o usuário tente incluir uma quantidade de itens maior do que o tamanho do vetor? Existe algo que possa ser feito para mitigar esse risco?

**Resposta:** Caso o usuário tente adicionar mais itens do que o vetor suporta, o método `adicionar(Item item)` verificará se ainda há espaço no vetor. Se o vetor estiver cheio, uma mensagem será exibida informando que não é possível adicionar mais itens. Para mitigar esse risco, o código poderia ser aprimorado para redimensionar o vetor automaticamente quando ele atingir sua capacidade máxima, utilizando o método `redimensionar(int novoTamanho)`.

### 5.3 - O que acontecerá caso o usuário tente excluir um item que não existe no vetor?

**Resposta:** Se o usuário tentar excluir um item em um índice inválido (fora do intervalo atual), o método `remover(int index)` exibirá uma mensagem informando que o índice é inválido e não realizará nenhuma operação.
