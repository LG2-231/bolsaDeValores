package bolsadevalores.estruturas;

public class Arvore<T extends Comparable<T>> {
    private class Nodo {
        T dado;
        Nodo esquerda;
        Nodo direita;

        public Nodo(T dado) {
            this.dado = dado;
            esquerda = null;
            direita = null;
        }
    }

    private Nodo raiz;

    public void inserir(T dado) {
        raiz = inserirRec(raiz, dado);
    }

    private Nodo inserirRec(Nodo nodo, T dado) {
        if (nodo == null) {
            return new Nodo(dado);
        }

        if (dado.compareTo(nodo.dado) < 0) {
            nodo.esquerda = inserirRec(nodo.esquerda, dado);
        } else if (dado.compareTo(nodo.dado) > 0) {
            nodo.direita = inserirRec(nodo.direita, dado);
        }

        return nodo;
    }
}
