package bolsadevalores.ativos;

import bolsadevalores.Empresa;

public abstract class Ativos {
    private String nome;
    private double preco;
    private Empresa empresa;

    public Ativos (String nome, double preco, Empresa empresa) {
        this.nome = nome;
        this.preco = preco;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}