package contollers;

import views.Menu;

import java.util.List;

public class MenuController {


        public static Boolean menuPrincipalController(){

        //    System.out.printf("Hello and welcome!");
            int option = 0;
            while (option != 3) {
                option = Menu.openMenu();
                while (!List.of(1, 2, 3).contains(option))
                    option = Menu.openMenu();

                int atributeOption = 0;
                if (option == 1) {
                    atributeOption = Menu.openAtributesMenu();

                    Jogo jogo = new Jogo();
                    jogo.iniciarJogo(atributeOption);

                    while (!List.of(1, 2, 3).contains(atributeOption))
                        atributeOption = Menu.openAtributesMenu();
                }
                if (option == 2)
                    Menu.Creditos();

                if (option == 3)
                    return true;
            }
            return false;
        }

    }

