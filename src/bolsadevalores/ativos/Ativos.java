package bolsadevalores.ativos;

import java.util.ArrayList;
import java.util.List;

public class Ativos {
    private String nome;
    private String tipoAtivo;
    private double preco;
    private List<Double> historicoPrecos;

    public Ativos (String nome, String tipoAtivo, double preco) {
        this.nome = nome;
        this.tipoAtivo = tipoAtivo;
        this.preco = preco;
        this.historicoPrecos = new ArrayList<>();
    }

    // Construtor, getters e setters
    // Outros métodos relevantes
}

