package dogs;

import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;

public class Main {


    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.createControllers();
    }

    private void createControllers() {
        IWelcomeController appController = new WelcomeController();
        appController.startApplication();
    }

}
