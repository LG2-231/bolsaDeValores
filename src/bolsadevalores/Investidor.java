package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ordem.Ordem;

public class Investidor {
    private String nome;
    private String cpf;
    private List<Carteira> carteiras;
    private List<Ordem> ordens;

    public Investidor (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteiras = new ArrayList<>();
        this.ordens = new ArrayList<>();
    }
}