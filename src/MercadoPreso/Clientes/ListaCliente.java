package MercadoPreso.Clientes;

public class ListaCliente {

    public noCliente inicio;
    public noCliente fim;

    public ListaCliente() {
        this.inicio = null;
        this.fim = null;
    }

    public void cadastrarCliente(String nome, String email, TipoCliente tipoConsumidor) {
        // Cria um novo cliente
        noCliente novoCliente = new noCliente(nome, email, tipoConsumidor);
        // Verifica se a lista está vazia
        if (inicio == null) {
            inicio = fim = novoCliente; // Se estiver, define o novo cliente como início e fim da lista
        } else {
            // Caso contrário, adiciona o novo cliente ao final da lista
            fim.proximoCliente = novoCliente;
            novoCliente.clienteAnterior = fim;
            fim = novoCliente;
        }
    }

    public noCliente buscarCliente(String nome) {
        noCliente atual = inicio;
        while (atual != null) {
            if (atual.nome.equals(nome)) {
                return atual;
            }
            atual = atual.proximoCliente;
        }
        return null;
    }

    // Método para remover um cliente pelo nome
   /* public void removerCliente(String nome) {
        noCliente atual = inicio;
        // Percorre a lista procurando pelo cliente com o nome fornecido
        while (atual != null) {
            if (atual.nome == nome) { // Usando == para comparar strings
                // Remove o cliente da lista
                if (atual.clienteAnterior != null) {
                    atual.clienteAnterior.proximoCliente = atual.proximoCliente;
                } else {
                    inicio = atual.proximoCliente;
                }
                if (atual.proximoCliente != null) {
                    atual.proximoCliente.clienteAnterior = atual.clienteAnterior;
                } else {
                    fim = atual.clienteAnterior;
                }
                return;
            }
            atual = atual.proximoCliente;
        }
    } */

    public boolean Vendedor(String nome) {
        noCliente cliente = buscarCliente(nome);
        return cliente != null && cliente.tipoConsumidor == TipoCliente.VENDEDOR;
    }


}
