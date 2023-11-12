package bolsadevalores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import bolsadevalores.ativos.Ativos;

public class Pregao {
    private List<Ativos> acoes;

    public Pregao() {
        this.acoes = new ArrayList<>();
    }

    public void adicionarAcao(Ativos acao) {
        acoes.add(acao);
    }
    
    public void realizarNegociacao() {
        Random random = new Random();

        for (Ativos acao : acoes) {
            double variacao = (random.nextDouble() - 0.5) * 10; // Simula uma variação de preço
            double novoPreco = acao.getPreco() + variacao;
            acao.setPreco(novoPreco);

            System.out.println("Ação: " + acao.getNome() + ", Novo Preço: " + novoPreco);
        }
    }
}
