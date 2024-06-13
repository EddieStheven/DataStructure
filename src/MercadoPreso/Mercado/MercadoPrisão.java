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

   /* public void removerCliente(String nome){ // Nesse método vc vai remover o cliente
        clientes.removerCliente(nome);
        System.out.println("O cliente " + nome + " foi removido! Otário");
    } */


    // Método para cadastrar novo produto
    public void adicionarProduto(String nome, String nomeProduto, double preco) {
        if (clientes.Vendedor(nome)) {
            produtos.adicionarProduto(nomeProduto, preco);
            System.out.println("Produto " + nomeProduto + " adicionado pelo vendedor " + nome);
        } else {
            System.out.println("  ");
            System.out.println("Lamento, " + nome + " apenas vendedores podem adicionar produtos!");
            System.out.println("Para se tornar vendedor, faça o cadastro!");
        }
    }

    // Método para realizar uma compra
    public void realizarCompra(int idCompra, String nomeProduto, String nomeComprador, String nomeVendedor) {
        Produto produtoRemovido = produtos.removerProduto();
        if (produtoRemovido != null) {
            compras.adicionarCompra(idCompra, nomeProduto,nomeComprador,nomeVendedor);
            System.out.println("O produto " + nomeProduto + " foi comprado por " + nomeComprador);
        } else {
            System.out.println("O produto " + nomeProduto + " foi comprado.");
        }
    }

    public void listarProdutos() {
        System.out.println("  ");
        produtos.listarProdutos();
    }

}

