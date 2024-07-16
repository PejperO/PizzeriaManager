import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Strona Główna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Dodajemy główne menu
        Panel_GUI mainMenuPanel = new Panel_GUI(mainPanel);
        mainPanel.add(mainMenuPanel, "mainMenu");

        // Dodajemy panel AddDishPanel
        AddDishPanel addDishPanel = new AddDishPanel(mainPanel);
        mainPanel.add(addDishPanel, "addDish");

        frame.add(mainPanel);
        frame.setVisible(true);

        cardLayout.show(mainPanel, "mainMenu");
    }
}
