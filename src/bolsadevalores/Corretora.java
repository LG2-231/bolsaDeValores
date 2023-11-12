package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.estruturas.Fila;

public class Corretora {
    private String nome;
    private static List<Ordem> ordens;
    private List<Investidor> clientes;
    private Fila<Ordem> ordensPendentes;    
    
    public Corretora(String nome){
        this.nome = nome;
        this.ordens = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    public void addCliente(Investidor cliente) {
        clientes.add(cliente);
    }
    
    public void removerCliente(Investidor cliente) {
        clientes.remove(cliente);
    }
    
    public static void emitirOrdem(Ordem ordem) {
        ordens.add(ordem);
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
    