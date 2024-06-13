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
        mercado.adicionarProduto("Igor", "aaaaaaaaaaaaa", 150.0);

        // Listar produtos disponíveis
        mercado.listarProdutos();

        mercado.realizarCompra(1,"Pista Hot-Wheels","Eddie","Igor");

        // Listar produtos disponíveis após compra
        mercado.listarProdutos();






    }
}
