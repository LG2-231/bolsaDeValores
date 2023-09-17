package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ativos.Ativos;

public class Custodiante {
    private String nome;
    private List<Ativos> ativosCustodiados;
    // Outros atributos e métodos relevantes
    public Custodiante(String nome){
        this.nome = nome;
        this.ativosCustodiados = new ArrayList<>();
    }
}
