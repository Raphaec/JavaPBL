package views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuView {
    // Usar um único Scanner para a aplicação evita vazamento de recursos e conflitos de I/O
    private static final Scanner scanner = new Scanner(System.in);

    public static int openMenu() {
        Terminal.limpaTerminal();
        System.out.println("------ Menu principal -------");
        System.out.println("Opção 1 - Jogar");
        System.out.println("Opção 2 - Créditos");
        System.out.println("Opção 3 - Sair");
        System.out.print("Digite o número da opção desejada: ");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            // Limpa a sujeira do buffer do teclado (a letra ou símbolo digitado)
            scanner.nextLine();
            // Retorna -1 indicando ao Controller que a entrada não foi um número
            return -1;
        }
    }

    public static int openAtributesMenu() {
        Terminal.limpaTerminal();
        System.out.println("------ Menu de atributos -------");
        System.out.println("Opção 1 - Sangue frio");
        System.out.println("Opção 2 - Equilíbrio perfeito");
        System.out.println("Opção 3 - Sangue quente");
        System.out.print("Digite o número da opção desejada: ");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            return -1;
        }
    }

    public static void apresentaErro(String mensagem) {
        System.out.println(mensagem);
        Terminal.aplicaDelay(900);
    }

    public static void Creditos(){
        Terminal.limpaTerminal();
        System.out.println("Obrigado por jogar!");
        Terminal.aplicaDelay(1000);
        System.out.println("Desenvolvidor por:");
        Terminal.aplicaDelay(700);
        System.out.println("Bruno Carneiro E Raphael Henrique");
        Terminal.aplicaDelay(1000);

        // main([""]);
    }






}
