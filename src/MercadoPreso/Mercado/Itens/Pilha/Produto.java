package MercadoPreso.Mercado.Itens.Pilha;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    // Atributos da classe
    public String nome;
    public double preco;
    // List onde vai ser armazenado a pilhas de produtos
    public List<Produto> pilha;

    public Produto() {
        pilha = new ArrayList<>(); // Inicializa a pilha de produtos
    }

    // Construtor da classe
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        pilha = new ArrayList<>(); // Cria uma nova lista de produtos

    }

    // Método para adcionar novo produto
    public void adicionarProduto(String nome, double preco){
        Produto produto = new Produto(nome, preco); // Criação do objeto
        pilha.add(produto); // adciona o produto a pilha
    }


    // Método para remover produto
     public Produto removerProduto(){
        int tamanho = pilha.size(); // Size é para ver o tamanho de uma ArrayList, então aqui a gente ver o tamanho da lista
        if (tamanho > 0) { // Verifica se a lista está vazia
            return pilha.remove(tamanho - 1).removerProduto(); // remove em -1 (ultimo item)
        }
        return null; // se a pilha estiver vazia, vai retornar null
    }

/*
    // Teste para tentar remover um item especifico da lista
    public Produto buscarProduto(String nomeProduto) {
        for (Produto produto : pilha) {
            if (produto.nome.equals(nomeProduto)) {
                return produto;
            }
        }
        return null;
    }
    public boolean removerProduto(String nomeProduto) {
        Produto produto = buscarProduto(nomeProduto);
        if (produto != null) {
            pilha.remove(produto);
            return true;
        }
        return false;
    }
 // Teste até aqui ============================


     */


    // Aqui vai listar os produtos na pilha
    public void listarProdutos(){
        System.out.println("Lista de produto");
        for (Produto produto : pilha ){
            System.out.println(produto.nome + " - R$ " + produto.preco);
        }
    }
}
