package MercadoPreso.Mercado.Itens.Arvore;

public class ArvoreCompra {
    public NoArvore raiz;

    public ArvoreCompra() { // A raiz da árvore é nula
        this.raiz = null;
    }

    // Aqui vc vai poder adcionar uma compra na árvore
    public void adicionarCompra(int idCompra, String detalhes){
        Compra novaCompra = new Compra(idCompra, detalhes); // uma nova compra
        raiz = adicionarRec(raiz,novaCompra); // ai vai adicionar a compra na arvore
    }

    public NoArvore adicionarRec(NoArvore raiz, Compra compra){ // Método para recursividade da árvore
        if (raiz == null) { // Se o nó atual é nulo, cria um novo nó com a compra e o retorna
            raiz = new NoArvore(compra);
        }
        if (compra.idCompra < raiz.compra.idCompra) { // Se o ID da compra é menor que o ID do nó atual, adiciona à subárvore esquerda
            raiz.esquerda = adicionarRec(raiz.esquerda, compra);
        } else if (compra.idCompra > raiz.compra.idCompra) { // Se o ID da compra é maior que o ID do nó atual, adiciona à subárvore direita
            raiz.direita = adicionarRec(raiz.direita, compra);
        }
        return raiz; // Vai retornar o nó raiz
    }

    public void listarCompras(){ // Vai listar todas as comprar da árvore
        System.out.println("=========================");
        listarRec(raiz); // Inicia a recursiva a partir da raiz
    }

    // Método recursivo para listar as compras em ordem
    public void listarRec(NoArvore raiz){ // Se o nó atual não for nulo, continua a listar
        if (raiz != null){
            listarRec(raiz.esquerda); // lista os nós da esquerda
            System.out.println("ID: " + raiz.compra.idCompra + ", O produto: " + raiz.compra.detalhes + " Foi comprado!");
            listarRec(raiz.direita); // lista os nós da direita
        }
    }

}
