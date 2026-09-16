
import java.util.List;
import java.util.Scanner;

import contollers.MenuController;
import views.Menu;

public class Main {
    public static void main(String[] args) {
        Boolean sair = false;

        while (!sair) {
            sair = MenuController.menuPrincipalController();
        }


    }

}