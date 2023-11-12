package bolsadevalores;

import bolsadevalores.ativos.Ativos;

public class Ordem {
    private Investidor investidor;
    private Ativos acao;
    private String tipoOrdem;
    private int quantidade;
    private double preco;

    public Ordem (Investidor investidor, Ativos acao, String tipoOrdem, int quantidade, double preco) {
        this.investidor = investidor;
        this.acao = acao;
        this.tipoOrdem = tipoOrdem;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public Ativos getAtivos() {
        return acao;
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
