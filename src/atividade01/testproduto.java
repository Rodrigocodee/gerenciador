package atividade01;

import java.util.Scanner;

public class testproduto {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        imprimirLinha();
        System.out.println("Digite o nome do Produto: ");
        String nome= input.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco= input.nextDouble();

        System.out.println("Digite a quantidade inicial em estoque: ");
        int quantidade = input.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produto.exibirDetalhes();


        int opcaoEstoque;
        do {
            System.out.println("O que deseja fazer com estoque? ");
            System.out.println("[1]Adicionar produtos");
            System.out.println("[2]Remover produtos");
            System.out.println("[0]Encerrar programa");

            opcaoEstoque = input.nextInt();

            switch (opcaoEstoque){
                case 1:
                    System.out.println("Deseja adicionar quantos ao estoque? ");
                    int adicionar = input.nextInt();
                    produto.adicionarEstoque(adicionar);
                    System.out.println("Adicionando " + adicionar + " unidades ao estoque...");
                    produto.exibirDetalhes();
                    break;

                case 2:
                    System.out.println("Deseja remover quantos produto do estoque: ");
                    int remover = input.nextInt();
                    produto.removerEstoque(remover);
                    System.out.println("Removendo " + remover + " unidades ao estoque...");
                    produto.exibirDetalhes();
                    break;

                case 0:
                    System.out.println("encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha uma opção válida.");
            }
        }while (opcaoEstoque != 0);

        imprimirLinha();
        input.close();
    }
    static void imprimirLinha() {
        System.out.println("---------------------------------");
    }
}
