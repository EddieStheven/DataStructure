package MercadoLivre.front;
import MercadoLivre.back.Mercado;

public class negocios {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        // Adicionar novos clientes
        mercado.adicionarNovoCliente("Igor", "Igor@example.com");
        mercado.adicionarNovoCliente("Maria", "Maria@example.com");

        // Contar e listar clientes
        System.out.println("Número de clientes: " + mercado.contarClientes());

        // Transformar um cliente em vendedor
        mercado.clienteViraVendedor("Igor", "Igor@example.com", "Dor de cabeça, Desgraça");

        // Contar clientes novamente
        System.out.println("Número de clientes após transformação: " + mercado.contarClientes());





    }

}
