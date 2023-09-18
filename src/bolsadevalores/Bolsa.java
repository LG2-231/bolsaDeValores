package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ativos.Ativos;
import bolsadevalores.estruturas.Fila;
import bolsadevalores.ordem.Ordem;

public class Bolsa {
    private String nome;
    private List<Ativos> ativosNegociados;
    private Fila<Ordem> ordensPendentes;
    
    public Bolsa (String nome) {
        this.nome = nome;
        this.ativosNegociados = new ArrayList<>();
        ordensPendentes = new Fila<>();
    }

    public void processarOrdens() {
        while (!ordensPendentes.isEmpty()) {
            Ordem ordem = ordensPendentes.desenfileirar();
            
        }
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}