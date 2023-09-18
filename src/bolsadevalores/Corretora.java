package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ordem.Ordem;

public class Corretora {
    private String nome;
    private List<Ordem> ordens;
    private List<Investidor> clientes;

    public Corretora(String nome){
        this.nome = nome;
        this.ordens = new ArrayList();
        this.clientes = new ArrayList<>();
    }
    
    public void addCliente(Investidor cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Investidor cliente) {
        clientes.remove(cliente);
    }

    public void adicionarOrdem(Ordem ordem) {
        ordens.add(ordem);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
    