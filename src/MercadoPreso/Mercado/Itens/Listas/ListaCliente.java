package MercadoPreso.Mercado.Itens.Listas;

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

    // Aqui vai buscar o cliente pelo nome dele
    public noCliente buscarCliente(String nome) {
        noCliente atual = inicio; // Meio que pega a variável 'atual' e pecorre a lista desde o inicio com ela
        while (atual != null) { // pecorre a lista só se o atual não for nulo
            // Equals serve para comparar, ele compara o nome do cliente atual com o que foi fornecido
            if (atual.nome.equals(nome)) {
                return atual; // se o nome bater, ele vai retornar o cliente atual
            }
            atual = atual.proximoCliente; // vai passar para o próximo cliente
        }
        return null;  // Se nenhum cliente com o nome fornecido for encontrado, retorna null
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

    public boolean Vendedor(String nome) { // Vai verificar se o cliente é vendedor
        noCliente cliente = buscarCliente(nome); // vai buscar pelo nome
        return cliente != null && cliente.tipoConsumidor == TipoCliente.VENDEDOR; // verifica se o cliente não é nulo e se o tipo dele é vendedor
    }


}
