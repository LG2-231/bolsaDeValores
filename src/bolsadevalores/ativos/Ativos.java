package bolsadevalores.ativos;

import bolsadevalores.Empresa;

public abstract class Ativos {
    private String nome;
    private String tipoAtivo;
    private double preco;
    private Empresa empresa;

    public Ativos (String nome, String tipoAtivo, double preco, Empresa empresa) {
        this.nome = nome;
        this.tipoAtivo = tipoAtivo;
        this.preco = preco;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAtivo() {
        return tipoAtivo;
    }
    
    public double getPreco() {
        return preco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}

