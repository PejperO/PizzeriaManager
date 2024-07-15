import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class AddDishPanel extends JPanel {
    public AddDishPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Dodaj Nowe Danie", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Większe odstępy między elementami
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Nazwa:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField nameField = new JTextField(20);
        nameField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Składniki:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField ingredientsField = new JTextField(20);
        ingredientsField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(ingredientsField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Czy wegetariańska:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JComboBox<String> vegetarianComboBox = new JComboBox<>(new String[] {"TAK", "NIE"});
        vegetarianComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(vegetarianComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Typ dania:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JComboBox<String> dishTypeComboBox = new JComboBox<>(new String[] {"Pizza", "Gnocchi", "Spaghetti"});
        dishTypeComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(dishTypeComboBox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        JButton addButton = new JButton("Dodaj");
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(addButton, gbc);

        add(formPanel, BorderLayout.CENTER);
    }
}

