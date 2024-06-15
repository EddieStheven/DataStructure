package MercadoPreso;

import MercadoPreso.Mercado.Itens.Listas.ListaCliente;
import MercadoPreso.Mercado.Itens.Listas.TipoCliente;
import MercadoPreso.Mercado.Itens.Listas.noCliente;
import MercadoPreso.Mercado.Itens.Arvore.ArvoreCompra;
import MercadoPreso.Mercado.Itens.Fila.FilaAvaliacao;
import MercadoPreso.Mercado.Itens.Pilha.Produto;

public class MercadoPrisão {

    // Associação com outras classes
    public ListaCliente clientes; // Lista
    public Produto produtos; // Pilha
    public ArvoreCompra compras; // Árvore
    public FilaAvaliacao avaliacoes;

    public MercadoPrisão() { // Construtor da classe

        // Pra inicializar a lista, a pilha e a Árvore
        clientes = new ListaCliente();
        produtos = new Produto();
        compras = new ArvoreCompra();
        avaliacoes = new FilaAvaliacao();

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
        if (clientes.Vendedor(nome)) { // Verifica se o cliente é vendedor
            produtos.adicionarProduto(nomeProduto, preco); // adiciona o produto a pilha se o cliente é vendedor
            System.out.println("Produto " + nomeProduto + " adicionado pelo vendedor " + nome); // aqui vai falar que foi adicionado
        } else {
            System.out.println("  "); // Vai avisar que só vendedor pode adicionar produto
            System.out.println("Lamento, " + nome + " apenas vendedores podem adicionar produtos!");
            System.out.println("Para se tornar vendedor, faça o cadastro!");
        }
    }

    // Método para realizar uma compra
    public void realizarCompra(int idCompra, String nomeProduto, String nomeComprador, String nomeVendedor) {
        Produto produtoRemovido = produtos.removerProduto(); // remove o produto da pilha de produtos
        if (produtoRemovido != null) {
            compras.adicionarCompra(idCompra, nomeProduto,nomeComprador,nomeVendedor); // Adiciona a compra à árvore de compras se o produto foi removido com sucesso
            System.out.println("O produto " + nomeProduto + " não está disponível.");
        } else { // vai falar que o produto não estava disponível
            System.out.println("O produto " + nomeProduto + " foi comprado por " + nomeComprador); // ai vai avisar que a compra foi feita
        }
    }

    public void listarProdutos() { // método para listar todos os produtos
        System.out.println("  ");
        produtos.listarProdutos();
    }


    // Método para adicionar avaliação
    public void adicionarAvaliacao(String nomeVendedor, String nomeConsumidor, int nota) {
        noCliente vendedor = clientes.buscarCliente(nomeVendedor);
        if (vendedor != null && vendedor.tipoConsumidor == TipoCliente.VENDEDOR) {
            avaliacoes.adicionarAvaliacao(nomeVendedor, nomeConsumidor, nota);
            System.out.println( nomeConsumidor + " Deu uma avaliação de " + nota + " adicionada para o vendedor " + nomeVendedor);
        } else {
            System.out.println("Avaliação não pode ser adicionada. Vendedor não encontrado.");
        }
    }

    // Método para listar avaliações
    public void listarAvaliacoes() {
        avaliacoes.listarAvaliacoes();
    }










}

