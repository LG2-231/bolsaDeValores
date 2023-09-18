package bolsadevalores;

public class Empresa {
    private String nome;
    private String cnpj;
    private int codigo;

    public Empresa(String nome, String cnpj,int codigo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getCodigo() {
        return codigo;
    }

}