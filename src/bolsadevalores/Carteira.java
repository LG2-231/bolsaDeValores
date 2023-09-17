package bolsadevalores;

import java.util.ArrayList;
import java.util.List;

import bolsadevalores.ativos.Ativos;

public class Carteira {
    private Investidor investidor;
    private List<Ativos> ativos;

    public Carteira (Investidor investidor) {
        this.investidor = investidor;
        this.ativos = new ArrayList<>();
    }

    // Outros atributos e métodos relevantes
}
