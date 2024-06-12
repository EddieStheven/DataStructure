package MercadoPreso.Mercado.Serviço;

import MercadoPreso.Clientes.TipoCliente;
import MercadoPreso.Mercado.Itens.Arvore.NoArvore;
import MercadoPreso.Mercado.MercadoPrisão;

public class Gerenciamento {
    public static void main(String[] args) {

        MercadoPrisão mercado = new MercadoPrisão();

        mercado.cadastrarCliente("Eddie","Eddie@gmail.com", TipoCliente.CLIENTE);
        mercado.cadastrarCliente("Igor","Igor2Pontos@gmail.com", TipoCliente.VENDEDOR);

        mercado.adicionarProduto("Infelicidade",100.0);
        mercado.adicionarProduto("felicidade",0);
        mercado.adicionarProduto("Pista Hot-Wheels",100000);

        mercado.produtos.listarProdutos();

        mercado.realizarCompra(1,"Infelicidade");
        mercado.realizarCompra(2,"Pista Hot-Wheels");

        mercado.removerCliente("Eddie");

        mercado.compras.listarCompras();












    }
}
