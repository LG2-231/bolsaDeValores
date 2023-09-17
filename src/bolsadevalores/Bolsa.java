package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ativos.Ativos;

public class Bolsa {
    private String nome;
    private List<Ativos> ativosNegociados;

    public Bolsa (String nome) {
        this.nome = nome;
        this.ativosNegociados = new ArrayList<>();
    }

    // Construtor, getters e setters
    // Outros métodos relevantes
}
