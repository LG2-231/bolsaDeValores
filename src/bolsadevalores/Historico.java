package bolsadevalores;

import bolsadevalores.estruturas.Pilha;

public class Historico {
    private Pilha<Transacao> historico;

    public Historico(){
        this.historico = new Pilha<>();
    }

    public void addTransacao(Transacao transacao) {
        historico.empilhar(transacao);
    }

}
