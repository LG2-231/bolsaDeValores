package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.estruturas.Pilha;
import bolsadevalores.ordem.Ordem;

public class Investidor {
    private String nome;
    private String cpf;
    private List<Carteira> carteiras;
    private Pilha<Ordem> historicoOrdens;

    public Investidor (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteiras = new ArrayList<>();
        this.historicoOrdens = new Pilha<>();
    }

    public void adicionarCarteira(Carteira carteira) {
        carteiras.add(carteira);
    }

    public void enviarOrdem(Ordem ordem) {
        historicoOrdens.empilhar(ordem);
    }
    
    public Ordem desfazerOrdem() {
        return historicoOrdens.desempilhar();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
}