package bolsadevalores.ordem;

import bolsadevalores.Investidor;
import bolsadevalores.ativos.Ativos;

public abstract class Ordem {
    private Investidor investidor;
    private Ativos ativo;
    private String tipoOrdem;
    private int quantidade;
    private double preco;

    public Ordem (Investidor investidor, Ativos ativo, String tipoOrdem, int quantidade, double preco) {
        this.investidor = investidor;
        this.ativo = ativo;
        this.tipoOrdem = tipoOrdem;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public Ativos getAtivos() {
        return ativo;
    }

    public String getTipoOrdem() {
        return tipoOrdem;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
