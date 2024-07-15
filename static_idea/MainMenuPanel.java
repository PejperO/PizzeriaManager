import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class MainMenuPanel extends JPanel {
    public MainMenuPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        // Dodanie obrazu na górze
        JLabel imageLabel = new JLabel();
        try {
            Image img = ImageIO.read(new File("src/img.png"));
            Image scaledImage = img.getScaledInstance(605, 133, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.NORTH);

        // Dodanie tytułu
        JLabel titleLabel = new JLabel("Menu Główne", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.CENTER);

        // Panel przycisków
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton addDishButton = new JButton("Dodaj Nowe Danie");
        addDishButton.setFont(new Font("Arial", Font.BOLD, 18));
        buttonPanel.add(addDishButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton addIngredientButton = new JButton("Dodaj Nowy Składnik");
        addIngredientButton.setFont(new Font("Arial", Font.BOLD, 18));
        buttonPanel.add(addIngredientButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton currentOrdersButton = new JButton("Aktualne Zamówienia");
        currentOrdersButton.setFont(new Font("Arial", Font.BOLD, 18));
        buttonPanel.add(currentOrdersButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JButton addPersonButton = new JButton("Dodaj Nową Osobę");
        addPersonButton.setFont(new Font("Arial", Font.BOLD, 18));
        buttonPanel.add(addPersonButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JButton modifyMenuButton = new JButton("Modyfikuj Menu");
        modifyMenuButton.setFont(new Font("Arial", Font.BOLD, 18));
        buttonPanel.add(modifyMenuButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        JButton addOrderButton = new JButton("Dodaj Nowe Zamówienie");
        addOrderButton.setFont(new Font("Arial", Font.BOLD, 18));
        buttonPanel.add(addOrderButton, gbc);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
