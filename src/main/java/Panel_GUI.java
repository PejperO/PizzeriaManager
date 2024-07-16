import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class Panel_GUI extends JPanel {
    private JPanel mainFrame; // Referencja do głównego panelu

    public Panel_GUI(JPanel mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        // obraz
        JLabel imageLabel = new JLabel();
        try {
            Image img = ImageIO.read(new File("src/img/logo.png"));
            Image scaledImage = img.getScaledInstance(605, 133, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.NORTH);

        // tytul
        JLabel titleLabel = new JLabel("Menu Główne", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.CENTER);

        // buttony
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton addDishButton = new JButton("Dodaj Nowe Danie");
        addDishButton.setFont(new Font("Arial", Font.BOLD, 18));
        addDishButton.addActionListener(e -> showPanel("addDish"));
        buttonPanel.add(addDishButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton addIngredientButton = new JButton("Dodaj Nowy Składnik");
        addIngredientButton.setFont(new Font("Arial", Font.BOLD, 18));
        addIngredientButton.addActionListener(e -> showAddIngredientPanel());
        buttonPanel.add(addIngredientButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton currentOrdersButton = new JButton("Aktualne Zamówienia");
        currentOrdersButton.setFont(new Font("Arial", Font.BOLD, 18));
        currentOrdersButton.addActionListener(e -> showOrderManagementPanel());
        buttonPanel.add(currentOrdersButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JButton addPersonButton = new JButton("Dodaj Nową Osobę");
        addPersonButton.setFont(new Font("Arial", Font.BOLD, 18));
        addPersonButton.addActionListener(e -> showAddPersonPanel());
        buttonPanel.add(addPersonButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JButton modifyMenuButton = new JButton("Modyfikuj Menu");
        modifyMenuButton.setFont(new Font("Arial", Font.BOLD, 18));
        modifyMenuButton.addActionListener(e -> showModifyMenuPanel());
        buttonPanel.add(modifyMenuButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        JButton addOrderButton = new JButton("Dodaj Nowe Zamówienie");
        addOrderButton.setFont(new Font("Arial", Font.BOLD, 18));
        addOrderButton.addActionListener(e -> showOrderPanel());
        buttonPanel.add(addOrderButton, gbc);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void showPanel(String panelName) {
        CardLayout layout = (CardLayout) mainFrame.getLayout();
        layout.show(mainFrame, panelName);
    }

    private void showAddIngredientPanel() {
        CardLayout layout = (CardLayout) mainFrame.getLayout();
        AddIngredientPanel addIngredientPanel = new AddIngredientPanel(mainFrame);
        mainFrame.add(addIngredientPanel, "addIngredient");
        layout.show(mainFrame, "addIngredient");
    }

    private void showOrderManagementPanel() {
        CardLayout layout = (CardLayout) mainFrame.getLayout();
        OrderManagementPanel orderManagementPanel = new OrderManagementPanel(mainFrame);
        mainFrame.add(orderManagementPanel, "orders");
        layout.show(mainFrame, "orders");
    }

    private void showAddPersonPanel() {
        CardLayout layout = (CardLayout) mainFrame.getLayout();
        AddPersonPanel addPersonPanel = new AddPersonPanel(mainFrame);
        mainFrame.add(addPersonPanel, "addPerson");
        layout.show(mainFrame, "addPerson");
    }

    private void showModifyMenuPanel() {
        CardLayout layout = (CardLayout) mainFrame.getLayout();
        ModifyMenuPanel modifyMenuPanel = new ModifyMenuPanel(mainFrame);
        mainFrame.add(modifyMenuPanel, "modifyMenu");
        layout.show(mainFrame, "modifyMenu");
    }

    private void showOrderPanel() {
        CardLayout layout = (CardLayout) mainFrame.getLayout();
        OrderPanel orderPanel = new OrderPanel(mainFrame);
        mainFrame.add(orderPanel, "addOrder");
        layout.show(mainFrame, "addOrder");
    }
}
