package MercadoPreso.Serviço;

import MercadoPreso.Clientes.TipoCliente;
import MercadoPreso.Mercado.MercadoPrisão;

public class Gerenciamento {
    public static void main(String[] args) {
        MercadoPrisão mercado = new MercadoPrisão();

        mercado.cadastrarCliente("Eddie","Eddie@gmail.com", TipoCliente.CLIENTE);
        mercado.cadastrarCliente("Igor","Igor2Pontos@gmail.com", TipoCliente.VENDEDOR);

        mercado.adicionarProduto("Infelicidade",100.0);
        mercado.adicionarProduto("felicidade",0);
        mercado.adicionarProduto("Pista Hot-Wheels",100000);

        mercado.produto.listarProdutos();







    }
}
