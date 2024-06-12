package MercadoPreso.Mercado;

import MercadoPreso.Clientes.ListaCliente;
import MercadoPreso.Clientes.TipoCliente;
import MercadoPreso.Clientes.noCliente;
import MercadoPreso.Mercado.Itens.Arvore.ArvoreCompra;
import MercadoPreso.Mercado.Itens.Pilha.Produto;

public class MercadoPrisão {

    // Associação com outras classes
    public ListaCliente clientes; // Lista
    public Produto produtos; // Pilha
    public ArvoreCompra compras; // Árvore

    public MercadoPrisão() { // Construtor da classe

        // Pra inicializar a lista, a pilha e a Árvore
        clientes = new ListaCliente();
        produtos = new Produto();
        compras = new ArvoreCompra();

    }

    // Esse método aqui vai cadastrar um novo cliente
    public void cadastrarCliente(String nome, String email, TipoCliente tipo) {
        clientes.cadastrarCliente(nome, email, tipo); // Aqui vai cadastrar novo cliente na lista
        System.out.println("O cliente: " + nome + " > " + email + " > " + tipo + " foi cadastrado!");
    }

    public void removerCliente(String nome){ // Nesse método vc vai remover o cliente
        clientes.removerCliente(nome);
        System.out.println("O cliente " + nome + " foi removido! Otário");
    }

    // Método para cadastrar novo produto
    public void adicionarProduto(String nome, double preco) {
        produtos.adicionarProduto(nome, preco); // Vai adcionar novo produto a pilha
        System.out.println("O produto foi cadastrado!");
        System.out.println(" " + nome + " no preço de " + preco + "R$");
    }
    // Método para realizar uma compra
    public void realizarCompra(int idCompra, String detalhes) {
        compras.adicionarCompra(idCompra, detalhes); // vai adicionar o produto na árvore
    }


}

