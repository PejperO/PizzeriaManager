import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class OrdersPanel extends JPanel {
    public OrdersPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Aktualne Zamówienia", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel ordersPanel = new JPanel(new BorderLayout());
        ordersPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Lista aktualnych zamówień (przykładowe dane)
        String[] orders = {"Zamówienie #1", "Zamówienie #2", "Zamówienie #3"};
        JList<String> ordersList = new JList<>(orders);
        ordersList.setFont(new Font("Arial", Font.PLAIN, 18));
        JScrollPane scrollPane = new JScrollPane(ordersList);
        ordersPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton viewHistoryButton = new JButton("Pokaż Historię");
        viewHistoryButton.setFont(new Font("Arial", Font.BOLD, 18));
        buttonPanel.add(viewHistoryButton, gbc);

        ordersPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(ordersPanel, BorderLayout.CENTER);
    }
}

