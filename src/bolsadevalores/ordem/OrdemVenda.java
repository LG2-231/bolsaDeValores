package bolsadevalores.ordem;

import bolsadevalores.Investidor;
import bolsadevalores.ativos.Ativos;

public class OrdemVenda extends Ordem {
    public OrdemVenda (Investidor investidor, Ativos ativo, String tipoOrdem, int quantidade, double preco) {
        super(investidor, ativo, tipoOrdem, quantidade, preco);
    }
}
