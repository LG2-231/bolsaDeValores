package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ordem.Ordem;

public class Corretora {
    private String nome;
    private List<Ordem> ordens;
    // Outros atributos e métodos relevantes
    public Corretora(String nome){
        this.nome = nome;
        this.ordens = new ArrayList<>();
    }
}