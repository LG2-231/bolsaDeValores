package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ativos.Ativos;

public class Custodiante {
    private String nome;
    private List<Ativos> ativosCustodiados;

    public Custodiante(String nome){
        this.nome = nome;
        this.ativosCustodiados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}