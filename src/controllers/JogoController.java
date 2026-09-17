package controllers;

import models.Capitulo;
import models.Cena;
import models.Escolha;
import models.Protagonista;

import java.util.ArrayList;
import java.util.List;

public class JogoController {

    // Armazena as cenas carregadas em memória para busca rápida por ID (como uma tabela hash)
    private List<Cena> cenasDoCapituloAtual;

    public JogoController() {
        this.cenasDoCapituloAtual = new ArrayList<>();
    }

    // Este método agora constrói as cenas e as arestas (escolhas) entre elas
    public Capitulo construirCapitulo(int idCapitulo) {
        Capitulo capitulo = new Capitulo(idCapitulo);

        // Nó 1
        Cena cena1 = new Cena(1, "O Despertar", "Você acorda em um quarto escuro. A porta está entreaberta.");
        cena1.adicionarEscolha(new Escolha("Sair pela porta", 2)); // Aponta para a Cena 2
        cena1.adicionarEscolha(new Escolha("Voltar a dormir", 3)); // Aponta para a Cena 3

        // Nó 2
        Cena cena2 = new Cena(2, "Corredor", "Você sai do quarto e encontra um corredor iluminado.");
        // (Adicionaria as escolhas da cena 2 aqui)

        // Nó 3
        Cena cena3 = new Cena(3, "Morte", "Você voltou a dormir e nunca mais acordou. Fim de jogo.");
        // Cena 3 não tem escolhas, é um nó folha (Fim de jogo)

        // Adiciona ao estado do controller
        cenasDoCapituloAtual.add(cena1);
        cenasDoCapituloAtual.add(cena2);
        cenasDoCapituloAtual.add(cena3);

        capitulo.setCenas(cenasDoCapituloAtual);
        return capitulo;
    }

    public void iniciarJogo(int atributo) {
        Protagonista jogador = new Protagonista(0, "você");
        // Opcional: jogador.definirAtributo(atributo);

        Capitulo cap1 = construirCapitulo(1);

        // A lógica do Game Loop virá aqui:
        // 1. Pegar a cena ID 1
        // 2. Mandar a View exibir o textoNarrativa e as escolhas
        // 3. Receber o input do jogador via View
        // 4. Mudar a cena atual para o 'proximaCenaId' escolhido.
    }
}