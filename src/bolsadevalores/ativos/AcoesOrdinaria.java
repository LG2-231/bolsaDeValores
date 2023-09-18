package bolsadevalores.ativos;

import bolsadevalores.Empresa;

public class AcoesOrdinaria extends Ativos {
    int codigo;

    public AcoesOrdinaria (String nome, String tipoAtivo, double preco, Empresa empresa, int codigo) {
        super(nome, tipoAtivo, preco, empresa);
        this.codigo = 3;
    }
}