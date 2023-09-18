package bolsadevalores.estruturas;

import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> lista;

    public Pilha() {
        lista = new LinkedList<>();
    }

    public void empilhar(T elemento) {
        lista.addFirst(elemento);
    }

    public T desempilhar() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return lista.removeFirst();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
