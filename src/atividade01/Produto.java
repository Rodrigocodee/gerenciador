package atividade01;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }


    void exibirDetalhes (){
        System.out.println("---------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("---------------------------------");
    }

    void adicionarEstoque(int adc){
         this.quantidade += adc;
    }

    void removerEstoque (int remove){
        if(remove <= this.quantidade){
            this.quantidade -= remove;
        }else{
            System.out.println("Erro! quantidade menor que no estoque.");
        }
    }
}
