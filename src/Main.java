import controllers.MenuController;

public class Main {
    public static void main(String[] args) {
        Boolean sair = false;

        while (!sair) {
            sair = MenuController.menuPrincipalController();
        }


    }

}