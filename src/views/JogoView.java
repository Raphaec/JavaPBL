package views;

import models.Cena;
import models.Escolha;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class JogoView {

    private static final Scanner scanner = new Scanner(System.in);


    public static int mostrarCena(Cena cena) {
        Terminal.limpaTerminal();

        // Imprime o cabeçalho e a narrativa
        System.out.println("=== " + cena.getTitulo() + " ===");
        System.out.println(cena.getTextoNarrativa());
        System.out.println();

        List<Escolha> escolhas = cena.getEscolhas();

        // Se a cena não tem escolhas, é um nó final (Fim de jogo)
        if (escolhas == null || escolhas.isEmpty()) {
            System.out.println("[Fim. Pressione ENTER para voltar ao menu principal]");
            scanner.nextLine();
            return -1; // Sinaliza para o Controller encerrar o loop
        }

        // Imprime as escolhas dinamicamente numeradas (1, 2, 3...)
        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println("Opção " + (i + 1) + " - " + escolhas.get(i).getTextoOpcao());
        }

        System.out.print("\nO que você faz? ");

        try {
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o "Enter" do buffer
            return opcao;
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpa a sujeira se o usuário digitar letras
            return 0; // 0 será tratado como erro pelo Controller
        }
    }

    public static void apresentaErro(String mensagem) {
        System.out.println(mensagem);
        Terminal.aplicaDelay(900);
    }
}