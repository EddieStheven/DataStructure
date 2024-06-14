package MercadoPreso.Mercado.Itens.Fila;


import java.util.LinkedList;

public class FilaAvaliacao {

  public LinkedList<Avaliacao> fila;

    public FilaAvaliacao() {
        this.fila = new LinkedList<>();
    }

    public void adicionarAvaliacao(String nomeVendedor, String nomeConsumidor, int nota){
        Avaliacao novaAvaliacao = new Avaliacao(nomeVendedor,nomeConsumidor, nota);
        fila.addLast(novaAvaliacao);

    }

    public Avaliacao removerAvaliacao(){
        return fila.poll();
    }

    public void listarAvaliacoes(){
        for (Avaliacao avaliacao : fila){
            System.out.println("Vendedor: " + avaliacao.nomeVendedor + ", Nota: " + avaliacao.nota);
        }
    }




}
