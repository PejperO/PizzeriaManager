import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class OrderPanel extends JPanel {

    private JPanel mainPanel; // Referencja do głównego panelu

    public OrderPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Dodaj Nowe Zamówienie", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Nazwa dania:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField dishNameField = new JTextField(20);
        dishNameField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(dishNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Ilość:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField quantityField = new JTextField(20);
        quantityField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(quantityField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Klient:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField customerField = new JTextField(20);
        customerField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(customerField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        JButton orderButton = new JButton("Zamów");
        orderButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(orderButton, gbc);

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
