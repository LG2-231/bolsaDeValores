package bolsadevalores.ativos;

import bolsadevalores.Empresa;

public class AcoesPreferenciais extends Ativos{
    int codigo;

    public AcoesPreferenciais (String nome, String tipoAtivo, double preco, Empresa empresa, int codigo) {
        super(nome, tipoAtivo, preco, empresa);
        this.codigo = 4;
    }
    
}