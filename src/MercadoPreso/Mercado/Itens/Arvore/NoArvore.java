package MercadoPreso.Mercado.Itens.Arvore;

public class NoArvore {
    public Compra compra;
    NoArvore esquerda;
    NoArvore direita;

    public NoArvore(Compra compra) {
        this.compra = compra;
        this.esquerda = null;
        this.direita = null;
    }

}

