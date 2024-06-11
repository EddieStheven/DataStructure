package MercadoLivre.back;

public class Vendedor extends Cliente {
    public String itens;
    public Vendedor vendedorAnterior;
    public Vendedor proximoVendedor;

    public Vendedor(String nome, String email, String itens) {
        super(nome, email);
        this.itens = itens;
        this.vendedorAnterior = null;
        this.proximoVendedor = null;
    }

}