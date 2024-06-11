package MercadoPreso.Clientes;

public class FuncaoCliente {

    // Referência para o primeiro e último cliente na lista
    public noCliente inicio;
    public noCliente fim;

    // Método para cadastrar um novo cliente
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

    // Método para remover um cliente pelo nome
    public void removerCliente(String nome) {
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
    }
}
