package controllers;

import models.Capitulo;
import models.Cena;
import models.Escolha;
import models.Protagonista;
import views.JogoView; // Importando a nova view

import java.util.ArrayList;
import java.util.List;

public class JogoController {

    private List<Cena> cenasDoCapituloAtual;

    public JogoController() {
        this.cenasDoCapituloAtual = new ArrayList<>();
    }

    public Capitulo construirCapitulo(int idCapitulo) {
        Capitulo capitulo = new Capitulo(idCapitulo);

        // Nó 1
        Cena cena1 = new Cena(1, "O Despertar", "Você acorda em um quarto escuro. A porta está entreaberta.");
        cena1.adicionarEscolha(new Escolha("Sair pela porta", 2));
        cena1.adicionarEscolha(new Escolha("Voltar a dormir", 3));

        // Nó 2
        Cena cena2 = new Cena(2, "Corredor", "Você sai do quarto e encontra um corredor iluminado. Apenas o silêncio ecoa.");
        cena2.adicionarEscolha(new Escolha("Explorar o corredor", 1)); // Só para testar, volta pra cena 1
        // Você pode adicionar mais opções aqui depois

        // Nó 3 (Nó final, sem escolhas)
        Cena cena3 = new Cena(3, "Morte", "Você voltou a dormir e nunca mais acordou. Fim de jogo.");

        cenasDoCapituloAtual.add(cena1);
        cenasDoCapituloAtual.add(cena2);
        cenasDoCapituloAtual.add(cena3);

        capitulo.setCenas(cenasDoCapituloAtual);
        return capitulo;
    }

    public void iniciarJogo(int atributo) {
        Protagonista jogador = new Protagonista(0, "você");
        Capitulo cap1 = construirCapitulo(1);

        int cenaAtualId = 1; // O jogo sempre começa pelo ID 1

        // O Game Loop: Roda até a view retornar -1 (Cena sem escolhas)
        while (cenaAtualId != -1) {

            // 1. Busca a cena correta na lista carregada em memória
            Cena cenaAtual = null;
            for (Cena c : cenasDoCapituloAtual) {
                if (c.getId() == cenaAtualId) {
                    cenaAtual = c;
                    break;
                }
            }

            if (cenaAtual == null) {
                JogoView.apresentaErro("Erro Crítico: Cena ID " + cenaAtualId + " não encontrada!");
                break;
            }

            // 2 e 3. Manda a View exibir e aguarda a digitação do jogador
            int opcaoEscolhida = JogoView.mostrarCena(cenaAtual);

            // Se for -1, a cena acabou e o jogador deu Enter
            if (opcaoEscolhida == -1) {
                break; // Sai do loop do jogo e volta para o MenuController
            }

            // 4. Validação e atualização de estado
            int quantidadeDeOpcoesValidas = cenaAtual.getEscolhas().size();

            if (opcaoEscolhida >= 1 && opcaoEscolhida <= quantidadeDeOpcoesValidas) {
                // Pega a escolha correspondente (o índice da lista começa em 0, então subtraímos 1)
                Escolha escolha = cenaAtual.getEscolhas().get(opcaoEscolhida - 1);

                // O estado do jogo é atualizado para o ponteiro da próxima cena
                cenaAtualId = escolha.getProximaCenaId();
            } else {
                JogoView.apresentaErro("A entrada fornecida é inválida."); // Reaproveitando sua mensagem padrão
            }
        }
    }
}