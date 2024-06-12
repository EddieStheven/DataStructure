package MercadoPreso.Mercado.Itens;

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
            return pilha.remove(tamanho - 1); // remove em -1 (ultimo item)
        }
        return null; // se a pilha estiver vazia, vai retornar null
    }

    // Aqui vai listar os produtos na pilha
    public void listarProdutos(){
        System.out.println("Lista de produto");
        for (Produto produto : pilha ){
            System.out.println(produto.nome + " - R$ " + produto.preco);
        }
    }
}
