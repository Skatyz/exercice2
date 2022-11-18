package dogs.view;

import dogs.controller.IWelcomeController;
import util.image.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeView extends JFrame implements IView, ActionListener {   // Configurer Eclipse pour ignorer les avertissements sur serial Id

    private static final String VIEW_TITLE = "Nos amis les chiens";
    private static final String WELCOME_MESSAGE = "Bienvenue !";

    private static final String WELCOME_PICTURE = "../ressource/dog.jpg";

    private static final String SIGN_UP_DOG = "Inscrire un chien...";
    private static final String LIST_OF_DOG = "Liste des chiens...";
    private static final Dimension DEFAULT_SIZE = new Dimension(475, 530);

    private IWelcomeController controller;		// Pas encore utilisé dans cette version...

    public WelcomeView(IWelcomeController controller) {
        super(VIEW_TITLE);

        this.controller = controller;

        this.initialize();
        this.setUpComponents();
    }

    @Override
    public void display() {
        this.setVisible(true);
    }

    private void initialize() {
        // setSize(): uniquement car JFrame avec une image - Ne pas utiliser avec les gestionnaires de mise en forme-Utiliser la méthode pack() à la place
        this.setSize(DEFAULT_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// par défaut: HIDE_ON_CLOSE
    }

    private void setUpComponents() {
        //this.setLayout(new BorderLayout());  					// Inutile car par défaut...
        this.setUpWelcomePanel();
        this.setUpActionPanel();
    }

    private void setUpWelcomePanel() {
        JPanel welcomePanel = new JPanel();
        JButton signUpButton = new JButton("Inscrire un chien...");

        this.add(welcomePanel, BorderLayout.CENTER);  // CENTER -> par défaut

        welcomePanel.setLayout(new BorderLayout());   // Strategy pattern: le gestionnaire de mise en forme
        addWelcomePicture(welcomePanel);
        addWelcomeMessage(welcomePanel);
        addSignUpButton(signUpButton);
    }

    private void addWelcomeMessage(JPanel welcomePanel) {
        JLabel welcomeMessage = new JLabel(WELCOME_MESSAGE, SwingConstants.CENTER);
        welcomePanel.add(welcomeMessage, BorderLayout.NORTH);
    }

    private void addWelcomePicture(JPanel welcomePanel) {
        ImageIcon image = ImageUtil.getImageIcon(this, WELCOME_PICTURE);
        JLabel welcomePicture = new JLabel(image);
        welcomePanel.add(welcomePicture, BorderLayout.CENTER);   // CENTER -> par défaut
    }

    private void addSignUpButton(JButton newButton) {
        JButton signUpButton = new JButton(SIGN_UP_DOG);
        newButton.add(signUpButton, BorderLayout.SOUTH);
        display();
    }

    private void setUpActionPanel() {
        JPanel actionPannel = new JPanel();
        this.add(actionPannel, BorderLayout.SOUTH);
        JButton signUpButton = new JButton(SIGN_UP_DOG);
        JButton listButton = new JButton(LIST_OF_DOG);
        signUpButton.setActionCommand(SIGN_UP_DOG);
        listButton.setActionCommand(LIST_OF_DOG);
        actionPannel.add(signUpButton);
        actionPannel.add(listButton);
        signUpButton.addActionListener(this);
        listButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(SIGN_UP_DOG)){
            System.out.println(SIGN_UP_DOG);
        }
        if (e.getActionCommand().equals(LIST_OF_DOG)){
            System.out.println(LIST_OF_DOG);
        }
    }
}
