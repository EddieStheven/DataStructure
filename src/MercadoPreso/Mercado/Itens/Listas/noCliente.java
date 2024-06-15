package MercadoPreso.Mercado.Itens.Listas;

public class noCliente {

    // Atributos da classe
    public String nome;
    public String email;
    public TipoCliente tipoConsumidor; // Tipo do cliente ( Veio da classe Enum, a pessoa pode ser Cliente ou Vendedor )
    public noCliente proximoCliente; // No referenciado ao proximo cliente
    public noCliente clienteAnterior; // No referenciando ao cliente anterior

    // Construtor
    public noCliente(String nome, String email, TipoCliente tipoConsumidor) {

        this.nome = nome; // Inicializa o atributo nome com o valor passado como parâmetro
        this.email = email; // Mesma coisa do nome
        this.tipoConsumidor = tipoConsumidor;

        // O No de referencia primeiramente é null, até cadastrar os proximos clientes
        this.proximoCliente = null;
        this.clienteAnterior = null;
    }
}
