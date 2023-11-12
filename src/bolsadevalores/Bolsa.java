package bolsadevalores;

import java.util.Scanner;

import bolsadevalores.ativos.AcoesOrdinaria;
import bolsadevalores.ativos.AcoesPreferenciais;

public class Bolsa {
    public static void main(String[] args) {
        Investidor I1 = new Investidor("João Silva", "309.163.843-80");

        Carteira C1 = new Carteira(I1);

        Corretora ITAU = new Corretora("Itau");
        ITAU.addCliente(I1);

        Empresa PETROBRAS = new Empresa("Petrobras", "33.000.167/0001-01", 1);
        Empresa AZUL = new Empresa("Azul", "09.305.994/0001-29", 2);

        AcoesOrdinaria acao1 = new AcoesOrdinaria("PETR", 2500.0, PETROBRAS);
        AcoesPreferenciais acao2 = new AcoesPreferenciais("AZUL", 1500.0, AZUL);
    
        Pregao pregao = new Pregao();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Comprar");
        System.out.println("2 - Vender");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Escolha uma ação");
                System.out.println("1 - PETR");
                System.out.println("2 - AZUL");

                int escolha2 = scanner.nextInt();

                switch (escolha2) {
                case 1:
                    pregao.adicionarAcao(acao1);
                    pregao.realizarNegociacao();

                    System.out.println("Aceitar negociação?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    int escolha4 = scanner.nextInt();

                    if (escolha4 == 1) {
                        Ordem Od1 = new Ordem(I1, acao1, "compra", 1, 2500.0);
                        Corretora.emitirOrdem(Od1);

                        Transacao T1 = new Transacao(Od1);
                    } else {
                        System.out.println("Operação encerrada");
                    }
                    break;
                case 2:
                    pregao.adicionarAcao(acao2);
                    pregao.realizarNegociacao();

                    System.out.println("Aceitar negociação?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    int escolha5 = scanner.nextInt();

                    if (escolha5 == 1) {
                        Ordem Od2 = new Ordem(I1, acao2, "compra", 1, 1500.0);
                        Corretora.emitirOrdem(Od2);

                        Transacao T1 = new Transacao(Od2);
                    } else {
                        System.out.println("Operação encerrada");
                    }
                break;
                default:
                    System.out.println("Opção inválida");
                }

               break;
            case 2:
                System.out.println("Escolha uma ação");
                System.out.println("1 - PETR");
                System.out.println("2 - AZUL");

                int escolha3 = scanner.nextInt();

                switch (escolha3) {
                case 1:
                    pregao.adicionarAcao(acao1);
                    pregao.realizarNegociacao();

                    System.out.println("Aceitar negociação?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    int escolha4 = scanner.nextInt();

                    if (escolha4 == 1) {
                        Ordem Od3 = new Ordem(I1, acao1, "venda", 1, 2500.0);
                        Corretora.emitirOrdem(Od3);

                        Transacao T1 = new Transacao(Od3);
                    } else {
                        System.out.println("Operação encerrada");
                    }
                    break;
                case 2:
                    pregao.adicionarAcao(acao2);
                    pregao.realizarNegociacao();

                    System.out.println("Aceitar negociação?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    int escolha5 = scanner.nextInt();

                    if (escolha5 == 1) {
                        Ordem Od4 = new Ordem(I1, acao2, "venda", 1, 1500.0);
                        Corretora.emitirOrdem(Od4);

                        Transacao T1 = new Transacao(Od4);
                    } else {
                        System.out.println("Operação encerrada");
                    }
                    
                break;
            default:
                    System.out.println("Opção inválida");
                }

               break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
} 

//add ativo na carteira, criar histórico
