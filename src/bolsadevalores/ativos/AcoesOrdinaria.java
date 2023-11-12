package bolsadevalores.ativos;

import bolsadevalores.Empresa;

public class AcoesOrdinaria extends Ativos {
    int codigo;

    public AcoesOrdinaria (String nome, double preco, Empresa empresa) {
        super(nome, preco, empresa);
        this.codigo = 3;
    }

    public int getCodigo() {
        return codigo;
    }
}