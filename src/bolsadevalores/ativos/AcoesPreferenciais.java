package bolsadevalores.ativos;

import bolsadevalores.Empresa;

public class AcoesPreferenciais extends Ativos{
    int codigo;

    public AcoesPreferenciais (String nome, double preco, Empresa empresa) {
        super(nome, preco, empresa);
        this.codigo = 4;
    }
    
    public int getCodigo() {
        return codigo;
    }
}