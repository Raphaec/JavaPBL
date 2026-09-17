package controllers;

import views.MenuView;

import java.util.List;

public class MenuController {

    public static Boolean menuPrincipalController(){

    //    System.out.printf("Hello and welcome!");
        int option = 0;
        while (option != 3) {
            option = MenuView.openMenu();
            while (!List.of(1, 2, 3).contains(option)){
                MenuView.apresentaErro("A entrada fornecida é inválida.");
                option = MenuView.openMenu();
            }
            int atributeOption = 0;
            if (option == 1) {
                atributeOption = MenuView.openAtributesMenu();

                JogoController jogoController = new JogoController();
                jogoController.iniciarJogo(atributeOption);

                while (!List.of(1, 2, 3).contains(atributeOption)) {
                    MenuView.apresentaErro("A entrada fornecida é inválida.");
                    atributeOption = MenuView.openAtributesMenu();
                }
            }
            if (option == 2)
                MenuView.Creditos();

            if (option == 3)
                return true;
        }
        return false;
    }


}

