import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AddIngredientPanel extends JPanel {

    private JPanel mainPanel; // Referencja do głównego panelu

    public AddIngredientPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Dodaj Nowy Składnik", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Nazwa składnika:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField nameField = new JTextField(20);
        nameField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(nameField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JButton addButton = new JButton("Dodaj");
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(addButton, gbc);

        JButton backButton = new JButton("Powrót");
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        backButton.addActionListener(e -> showMainPanel());
        add(backButton, BorderLayout.SOUTH);

        add(formPanel, BorderLayout.CENTER);
    }

    private void showMainPanel() {
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.show(mainPanel, "mainMenu");
    }
}
