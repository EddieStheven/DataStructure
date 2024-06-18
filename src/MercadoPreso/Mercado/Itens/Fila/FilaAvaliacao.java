package MercadoPreso.Mercado.Itens.Fila;


import java.util.LinkedList;

public class FilaAvaliacao {

    // Lista encadeada para armazenar as avaliações
  public LinkedList<Avaliacao> fila;

    public FilaAvaliacao() {
        this.fila = new LinkedList<>();
    }

    // vai adicionar uma nova avaliação
    public void adicionarAvaliacao(String nomeVendedor, String nomeConsumidor, int nota){
        Avaliacao novaAvaliacao = new Avaliacao(nomeVendedor,nomeConsumidor, nota); // cria um novo objeto Avaliacao
        fila.addLast(novaAvaliacao); // Adiciona a nova avaliação ao final da fila

    }

    public Avaliacao removerAvaliacao() {
        return fila.poll(); // Poll é usado para remover o objeto da fila
    }

    public void listarAvaliacoes(){
        for (Avaliacao avaliacao : fila){ // vai listar toda as avaliações
            System.out.println("Vendedor: " + avaliacao.nomeVendedor + ", Nota: " + avaliacao.nota);
        }
    }




}
