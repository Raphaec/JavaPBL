package views;

import java.util.Scanner;

public class Menu {


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

    public static int openMenu(){
        Terminal.limpaTerminal();
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o número da opção desejada");
        System.out.println("------Menu principal-------");
        System.out.println("Opção 1 - Jogar");
        System.out.println("Opção 2 - Créditos");
        System.out.println("Opção 3 - sair");

        try{

            return scanner.nextInt();
        }
        catch(Exception e){

            System.out.println("entrada inválida");

            return 0;
        }

    }


    public static int openAtributesMenu(){
        Terminal.limpaTerminal();
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o número da opção desejada");
        System.out.println("------Menu de atributos-------");
        System.out.println("Opção 1 - Sangue frio");
        System.out.println("Opção 2 - Equilíbrio perfeito");
        System.out.println("Opção 3 - sair");

        try{

            return scanner.nextInt();
        }
        catch(Exception e){

            System.out.println("entrada inválida");
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            return 0;
        }

    }



}
