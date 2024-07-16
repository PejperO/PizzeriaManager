import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ModifyMenuPanel extends JPanel {

    private JPanel mainPanel; // Referencja do głównego panelu

    public ModifyMenuPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Modyfikuj Menu", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Wybierz danie:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JComboBox<String> dishComboBox = new JComboBox<>(new String[] {"Pizza", "Gnocchi", "Spaghetti"});
        dishComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(dishComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Nowa nazwa:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField newNameField = new JTextField(20);
        newNameField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(newNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Nowe składniki:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField newIngredientsField = new JTextField(20);
        newIngredientsField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(newIngredientsField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        JButton modifyButton = new JButton("Modyfikuj");
        modifyButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(modifyButton, gbc);

        add(formPanel, BorderLayout.CENTER);
        JButton backButton = new JButton("Powrót");
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        backButton.addActionListener(e -> showMainPanel());
        add(backButton, BorderLayout.SOUTH);
    }

    private void showMainPanel() {
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.show(mainPanel, "mainMenu");
    }
}
