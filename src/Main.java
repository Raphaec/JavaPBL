
import java.util.List;
import java.util.Scanner;

import contollers.MenuController;
import views.Menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boolean sair = false;

        while (!sair) {
            sair = MenuController.menuPrincipalController();
        }


    }

}