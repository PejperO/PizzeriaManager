import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddPersonPanel extends JPanel {
    public AddPersonPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Dodaj Nową Osobę", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Większe odstępy między elementami
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Imię:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField firstNameField = new JTextField(20);
        firstNameField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(firstNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Nazwisko:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JTextField lastNameField = new JTextField(20);
        lastNameField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(lastNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Typ osoby:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JComboBox<String> personTypeComboBox = new JComboBox<>(new String[] {"Właściciel", "Klient", "Pracownik"});
        personTypeComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(personTypeComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Rodzaj pracownika:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        JComboBox<String> employeeTypeComboBox = new JComboBox<>(new String[] {"", "Kelner", "Kucharz"});
        employeeTypeComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(employeeTypeComboBox, gbc);

        // Słuchacz zdarzeń do ukrywania/wyświetlania pola "Rodzaj pracownika"
        personTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) personTypeComboBox.getSelectedItem();
                if ("Pracownik".equals(selected)) {
                    employeeTypeComboBox.setVisible(true);
                } else {
                    employeeTypeComboBox.setVisible(false);
                }
            }
        });

        employeeTypeComboBox.setVisible(false);

        gbc.gridx = 1;
        gbc.gridy = 4;
        JButton addButton = new JButton("Dodaj");
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(addButton, gbc);

        add(formPanel, BorderLayout.CENTER);
    }
}
