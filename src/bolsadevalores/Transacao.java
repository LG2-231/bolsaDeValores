package bolsadevalores;

import java.util.Date;

public class Transacao {
    private Ordem ordem;
    private Date dataHora;
    private double valorTotal;

    public Transacao(Ordem ordem) {
        this.ordem = ordem;
        this.dataHora = new Date();
        this.valorTotal = ordem.getQuantidade() * ordem.getPreco();
    }
}
