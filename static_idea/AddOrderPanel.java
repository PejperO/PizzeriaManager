import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddOrderPanel extends JPanel {
    public AddOrderPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Dodaj Nowe Zamówienie", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Większe odstępy między elementami
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Numer Stołu:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField tableNumberField = new JTextField(20);
        tableNumberField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(tableNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Danie:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JComboBox<String> dishComboBox = new JComboBox<>(new String[] {"Pizza", "Gnocchi", "Spaghetti"});
        dishComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(dishComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Ilość:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField quantityField = new JTextField(20);
        quantityField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(quantityField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Komentarz:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField commentField = new JTextField(20);
        commentField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(commentField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        JButton addButton = new JButton("Dodaj Zamówienie");
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(addButton, gbc);

        add(formPanel, BorderLayout.CENTER);
    }
}
