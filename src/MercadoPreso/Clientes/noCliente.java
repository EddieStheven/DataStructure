package MercadoPreso.Clientes;

public class noCliente {

    // Declaração dos atributos públicos da classe
    public String nome;
    public TipoCliente tipoConsumidor; // Tipo do cliente (presumivelmente uma enumeração ou classe chamada TipoCliente)
    public String email;
    public noCliente proximoCliente; // Referência para o próximo cliente na lista
    public noCliente clienteAnterior; // Referência para o cliente anterior na lista

    // Construtor
    public noCliente(String nome, String email, TipoCliente tipoConsumidor) {
        // Inicializa o atributo nome com o valor passado como parâmetro
        this.nome = nome;
        // Inicializa o atributo email com o valor passado como parâmetro
        this.email = email;
        // Inicializa o atributo tipoConsumidor com o valor passado como parâmetro
        this.tipoConsumidor = tipoConsumidor;
        // Inicializa o atributo proximoCliente (parece um erro, pois deveria ser null inicialmente)
        this.proximoCliente = proximoCliente;
        // Inicializa o atributo clienteAnterior (parece um erro, pois deveria ser null inicialmente)
        this.clienteAnterior = clienteAnterior;
    }
}
