package bolsadevalores.ordem;

import bolsadevalores.Investidor;
import bolsadevalores.ativos.Ativos;

public class Ordem {
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

    // Construtor, getters e setters
    // Outros métodos relevantes
}