package br.com.fiap.vetoresprimitivos.models;

public class Item {
    private String nome;
    private int codigo;
    private double preco;

    public Item(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nNome do Item: " + nome + "\nCódigo: " + codigo + "\nPreço: " + preco;
    }
}
