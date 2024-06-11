package MercadoLivre.back;

public class Mercado {
    public Cliente cliente;  // Cabeça da lista de clientes
    public Vendedor vendedor;  // Cabeça da lista de vendedores

    // Construtor da classe Mercado
    public Mercado() {
        this.cliente = null;
        this.vendedor = null;
    }

    // Método para contar o número de clientes
    public int contarClientes() {
        int contador = 0;

        // Se a lista está vazia
        if (this.cliente != null) {
            Cliente noAtual = this.cliente;

            // Percorre a lista de clientes e conta quantos existem
            while (noAtual != null) {
                contador++;
                noAtual = noAtual.clienteProximo;
            }
        }
        return contador;
    }

    // Método para adicionar um novo cliente
    public void adicionarNovoCliente(String nome, String email) {
        Cliente novoCliente = new Cliente(nome, email);

        // Se a lista está vazia, adiciona como o primeiro cliente
        if (this.cliente == null) {
            this.cliente = novoCliente;
        } else {
            Cliente clienteAtual = this.cliente;
            // Percorre a lista até o último cliente
            while (clienteAtual.clienteProximo != null) {
                clienteAtual = clienteAtual.clienteProximo;
            }
            // Adiciona o novo cliente ao final da lista
            clienteAtual.clienteProximo = novoCliente;
            novoCliente.clienteAnterior = clienteAtual;
        }
    }

    // Método para transformar um cliente em vendedor
    public void clienteViraVendedor(String nome, String email, String itens) {
        if (this.cliente == null) {
            System.out.println("Nenhum cliente encontrado.");
            return;
        }

        Cliente clienteAtual = this.cliente;
        while (clienteAtual != null) {
            // Verifica se o cliente com o nome e email fornecidos existe
            if (clienteAtual.nome.equals(nome) && clienteAtual.email.equals(email)) {
                Vendedor novoVendedor = new Vendedor(nome, email, itens);
                adicionarNovoVendedor(novoVendedor);
                removerCliente(clienteAtual);
                System.out.println("Cliente " + nome + " agora é um vendedor.");
                return;
            }
            clienteAtual = clienteAtual.clienteProximo;
        }
        System.out.println("Cliente não encontrado.");
    }

    // Método privado para adicionar um novo vendedor
    private void adicionarNovoVendedor(Vendedor novoVendedor) {
        if (this.vendedor == null) {
            this.vendedor = novoVendedor;
        } else {
            Vendedor vendedorAtual = this.vendedor;
            // Percorre a lista até o último vendedor
            while (vendedorAtual.proximoVendedor != null) {
                vendedorAtual = vendedorAtual.proximoVendedor;
            }
            // Adiciona o novo vendedor ao final da lista
            vendedorAtual.proximoVendedor = novoVendedor;
            novoVendedor.vendedorAnterior = vendedorAtual;
        }
    }

    // Método privado para remover um cliente da lista de clientes
    private void removerCliente(Cliente clienteRemover) {
        if (clienteRemover == this.cliente) {
            // Se o cliente a ser removido é o primeiro da lista
            this.cliente = clienteRemover.clienteProximo;
            if (this.cliente != null) {
                this.cliente.clienteAnterior = null;
            }
        } else {
            Cliente anterior = clienteRemover.clienteAnterior;
            Cliente proximo = clienteRemover.clienteProximo;
            // Ajusta os ponteiros da lista para remover o cliente
            if (anterior != null) {
                anterior.clienteProximo = proximo;
            }
            if (proximo != null) {
                proximo.clienteAnterior = anterior;
            }
        }
    }
}




