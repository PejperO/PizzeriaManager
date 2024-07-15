import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

class OrderManagementPanel extends JPanel {
    public OrderManagementPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Zarządzanie Zamówieniami", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel orderPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Większe odstępy między elementami
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Aktualne zamówienia
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        orderPanel.add(new JLabel("Aktualne Zamówienia:", JLabel.LEFT), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        String[] currentOrders = {
                "Zamówienie 1: Margherita - Stół 5 - 12:30",
                "Zamówienie 2: Gnocchi z sosem - Stół 3 - 12:45",
                "Zamówienie 3: Spaghetti Carbonara - Stół 7 - 13:00"
        };
        JList<String> currentOrdersList = new JList<>(currentOrders);
        currentOrdersList.setFont(new Font("Arial", Font.PLAIN, 18));
        currentOrdersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(currentOrdersList);
        orderPanel.add(scrollPane, gbc);

        // Przycisk modyfikowania zamówienia
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        JButton modifyOrderButton = new JButton("Modyfikuj Zamówienie");
        modifyOrderButton.setFont(new Font("Arial", Font.BOLD, 18));
        orderPanel.add(modifyOrderButton, gbc);

        // Nowe zamówienie
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        orderPanel.add(new JSeparator(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        orderPanel.add(new JLabel("Nowe Zamówienie:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        JTextField newOrderField = new JTextField(30);
        newOrderField.setFont(new Font("Arial", Font.PLAIN, 18));
        orderPanel.add(newOrderField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        JButton addOrderButton = new JButton("Dodaj Zamówienie");
        addOrderButton.setFont(new Font("Arial", Font.BOLD, 18));
        orderPanel.add(addOrderButton, gbc);

        // Przycisk historii
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        JButton viewHistoryButton = new JButton("Pokaż Historię Zamówień");
        viewHistoryButton.setFont(new Font("Arial", Font.BOLD, 18));
        orderPanel.add(viewHistoryButton, gbc);

        add(orderPanel, BorderLayout.CENTER);
    }
}

