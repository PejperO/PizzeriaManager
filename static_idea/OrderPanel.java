import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class OrderPanel extends JPanel {
    public OrderPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Zamówienie", JLabel.CENTER);
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
    }
}
