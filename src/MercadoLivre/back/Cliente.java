package MercadoLivre.back;

public class Cliente {
    public String nome;
    public String email;
    public Cliente clienteAnterior;
    public Cliente clienteProximo;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.clienteAnterior = null;
        this.clienteProximo = null;
    }


}

