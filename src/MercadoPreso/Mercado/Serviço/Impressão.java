package MercadoPreso.Mercado.Serviço;

import MercadoPreso.Clientes.TipoCliente;
import MercadoPreso.Mercado.MercadoPrisão;

public class Impressão {
    public static void main(String[] args) {

        MercadoPrisão mercado = new MercadoPrisão();

        // Cadastrar clientes
        mercado.cadastrarCliente("Eddie", "Eddie@example.com", TipoCliente.CLIENTE);
        mercado.cadastrarCliente("Igor", "Igor@example.com", TipoCliente.VENDEDOR);

        // Adicionar produtos pelo vendedor
        mercado.adicionarProduto("Igor", "Pista Hot-Wheels", 100.0);
        mercado.adicionarProduto("Igor", "10 pontos na AV3", 150.0);
        mercado.adicionarProduto("Eddie", "Maconha", 200.0); // Vai falhar pq só vendedor pode adicionar produto

        // Listar produtos disponíveis após compra
        mercado.listarProdutos();

        mercado.realizarCompra(1,"10 ponto na AV3","Eddie","Igor");

        mercado.listarProdutos();

        mercado.realizarCompra(2,"Pista Hot-Wheels","Eddie","Igor");

        mercado.adicionarAvaliacao("Igor","Eddie",8 );
        mercado.adicionarAvaliacao("Igor", "Eddie",10 );

        mercado.listarAvaliacoes();

    }
}
