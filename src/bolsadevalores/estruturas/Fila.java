package bolsadevalores.estruturas;

import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> lista;

    public Fila() {
        lista = new LinkedList<>();
    }

    public void enfileirar(T elemento) {
        lista.addLast(elemento);
    }

    public T desenfileirar() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return lista.removeFirst();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

}
