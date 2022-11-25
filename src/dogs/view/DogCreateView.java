
package dogs.view;

import dogs.controller.IDogController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DogCreateView extends JDialog implements IView, ActionListener {

    private static final String VIEW_TITLE = "Inscription d'un chien";

    private JTextField name = new JTextField(15);
    private JTextField breed = new JTextField(20);

    private IDogController controller;


    public DogCreateView(IDogController controller) {
        super();

        this.controller = controller;

        this.initialize();
        this.setUpComponents();
        this.pack();
    }

    @Override
    public void display() {
        // compl�ter
        this.setVisible(true);
    }

    private void initialize() {
        this.setTitle(VIEW_TITLE);
        this.setModalityType(DEFAULT_MODALITY_TYPE);
    }

    private void setUpComponents() {
        this.setUpInputDataPanel();
        this.setUpActionPanel();
    }

    private void setUpInputDataPanel() {
        // container interm�diaire JPanel qui contient les �tiquettes (JLabel) et les zones de textes (JTextField)
        JPanel newPanel = new JPanel();
        JLabel nameLabel = new JLabel("Nom:");
        JLabel raceLabel = new JLabel("race:");
        JTextField nameTxtField = new JTextField();
        JTextField raceTxtField = new JTextField();

        this.add(newPanel, BorderLayout.CENTER);

        addTextField(newPanel, String.valueOf(nameLabel), nameTxtField);
        addTextField(newPanel, String.valueOf(raceLabel), raceTxtField);

        // utiliser un GridLayout comme LayoutManager
    }

    private void addTextField(JPanel panel, String labelText, JTextField textField) {
        // Pour ajouter successivement une �tiquette et une zone de texte au panel
        JLabel nameLabel = new JLabel("Nom:");
        JLabel raceLabel = new JLabel("race:");
        JTextField nameTxtField = new JTextField();
        JTextField raceTxtField = new JTextField();
        panel.add(nameLabel, BorderLayout.CENTER);
        textField.add(nameTxtField, BorderLayout.EAST);
        textField.add(raceTxtField, BorderLayout.EAST);
        display();

    }

    private void setUpActionPanel() {
        // container interm�diaire JPanel qui contient le bouton pour inscrire le chien
        JPanel actionPannel = new JPanel();
        this.add(actionPannel, BorderLayout.SOUTH);
        JButton signUp = new JButton();
        signUp.setActionCommand("Incrire");
        actionPannel.add(signUp);
        signUp.addActionListener(this);
        addButton(actionPannel, "Inscrire", "Chien inscrit");
    }

    // m�me m�thode que dans WelcomeView
    // DRY -> m�thode utilitaire � extraire dans une classe utilitaire util.view.ViewUtil
    private void addButton(JPanel actionPanel, String buttonText, String buttonAction) {
        // Pour ajouter un bouton au panel
        JButton signUp = new JButton(buttonText);
        actionPanel.add(signUp, BorderLayout.SOUTH);
        display();
    }

    private void createDog() {
        // afficher seulement un message en console
        System.out.println("Votre chien a bien été enregistrer");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // intercepter l'�v�nement sur le bouton Inscrire et appeler la m�thode createDog
        if (e.getActionCommand().equals("Chien inscrit")){
            createDog();
        }
    }

}
