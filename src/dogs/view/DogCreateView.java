
package dogs.view;

import dogs.controller.IDogController;

import javax.swing.*;
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
        // utiliser un GridLayout comme LayoutManager
    }

    private void addTextField(JPanel panel, String labelText, JTextField textField) {
        // Pour ajouter successivement une �tiquette et une zone de texte au panel
    }

    private void setUpActionPanel() {
        // container interm�diaire JPanel qui contient le bouton pour inscrire le chien
    }

    // m�me m�thode que dans WelcomeView
    // DRY -> m�thode utilitaire � extraire dans une classe utilitaire util.view.ViewUtil
    private void addButton(JPanel actionPanel, String buttonText, String buttonAction) {
        // Pour ajouter un bouton au panel
    }

    private void createDog() {
        // afficher seulement un message en console
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // intercepter l'�v�nement sur le bouton Inscrire et appeler la m�thode createDog
    }

}
