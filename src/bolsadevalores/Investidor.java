package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

public class Investidor {
    private String nome;
    private String cpf;
    private List<Carteira> carteiras;

    public Investidor (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteiras = new ArrayList<>();
    }

    public void adicionarCarteira(Carteira carteira) {
        carteiras.add(carteira);
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