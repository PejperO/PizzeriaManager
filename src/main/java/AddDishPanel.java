import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AddDishPanel extends JPanel {

    private JComboBox<String> dishTypeComboBox;
    private JTextField nameField;
    private JList<Topping> toppingList;
    private JTextField sizeField;
    private JCheckBox isSpicyCheckBox;
    private JTextField originField;
    private JTextField sauceField;

    private DefaultListModel<Topping> toppingListModel;
    private JPanel pizzaPanel;
    private JPanel spaghettiPanel;
    private JPanel gnocchiPanel;

    //private JPanel mainPanel;

    public AddDishPanel(JPanel mainPanel) {
        //this.mainPanel = mainPanel;

        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Dodaj Danie", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // typ
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Danie:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        dishTypeComboBox = new JComboBox<>(new String[]{"Pizza", "Spaghetti", "Gnocchi"});
        dishTypeComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(dishTypeComboBox, gbc);

        // nazwa
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Nazwa:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        nameField = new JTextField(20);
        nameField.setFont(new Font("Arial", Font.PLAIN, 18));
        formPanel.add(nameField, gbc);

        // skladniki
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Składniki:", JLabel.RIGHT), gbc);

        gbc.gridx = 1;
        toppingListModel = new DefaultListModel<>();
        toppingList = new JList<>(toppingListModel);
        toppingList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        toppingList.setFont(new Font("Arial", Font.PLAIN, 18));
        toppingList.setVisibleRowCount(5);
        JScrollPane toppingScrollPane = new JScrollPane(toppingList);
        toppingScrollPane.setPreferredSize(new Dimension(200, 100));
        formPanel.add(toppingScrollPane, gbc);

        // dodatki - pizza
        pizzaPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        pizzaPanel.add(new JLabel("Wielkość:", JLabel.RIGHT));
        sizeField = new JTextField(20);
        sizeField.setFont(new Font("Arial", Font.PLAIN, 18));
        pizzaPanel.add(sizeField);

        pizzaPanel.add(new JLabel("Ostra:", JLabel.RIGHT));
        isSpicyCheckBox = new JCheckBox();
        isSpicyCheckBox.setFont(new Font("Arial", Font.PLAIN, 18));
        pizzaPanel.add(isSpicyCheckBox);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        formPanel.add(pizzaPanel, gbc);

        // dodatki - spaghetti
        spaghettiPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        spaghettiPanel.add(new JLabel("Pochodzenie:", JLabel.RIGHT));
        originField = new JTextField(20);
        originField.setFont(new Font("Arial", Font.PLAIN, 18));
        spaghettiPanel.add(originField);

        gbc.gridy = 4;
        formPanel.add(spaghettiPanel, gbc);

        // dodatki - gnocchi
        gnocchiPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        gnocchiPanel.add(new JLabel("Sos:", JLabel.RIGHT));
        sauceField = new JTextField(20);
        sauceField.setFont(new Font("Arial", Font.PLAIN, 18));
        gnocchiPanel.add(sauceField);

        gbc.gridy = 5;
        formPanel.add(gnocchiPanel, gbc);

        // dodaj
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        JButton addButton = new JButton("Dodaj");
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(addButton, gbc);

        // wroc
        gbc.gridx = 1;
        gbc.gridy = 7;
        JButton backButton = new JButton("Powrót");
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        formPanel.add(backButton, gbc);

        add(formPanel, BorderLayout.CENTER);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) mainPanel.getLayout();
                layout.show(mainPanel, "mainMenu");
            }
        });

        dishTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFieldsVisibility();
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDish();
            }
        });

        loadToppings();
        updateFieldsVisibility();
    }

    private void updateFieldsVisibility() {
        String selectedDishType = (String) dishTypeComboBox.getSelectedItem();

        pizzaPanel.setVisible("Pizza".equals(selectedDishType));
        spaghettiPanel.setVisible("Spaghetti".equals(selectedDishType));
        gnocchiPanel.setVisible("Gnocchi".equals(selectedDishType));
    }

    private void loadToppings() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("persistence_unit").createEntityManager();
        List<Topping> toppings = entityManager.createQuery("SELECT t FROM Topping t", Topping.class).getResultList();
        entityManager.close();

        toppingListModel.clear();
        for (Topping topping : toppings) {
            toppingListModel.addElement(topping);
        }
    }


    private void addDish() {
        String dishType = (String) dishTypeComboBox.getSelectedItem();
        String name = nameField.getText();

        // Sprawdzenie, czy pole sizeField jest puste lub niepoprawne
        double size = 0.0;
        if (!sizeField.getText().isEmpty()) {
            try {
                size = Double.parseDouble(sizeField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nieprawidłowy format rozmiaru. Proszę wprowadzić poprawny numer.");
                return;
            }
        }

        EntityManager entityManager = Persistence.createEntityManagerFactory("persistence_unit").createEntityManager();
        entityManager.getTransaction().begin();

        switch (dishType) {
            case "Pizza":
                Pizza pizza = new Pizza();
                pizza.setName(name);
                pizza.setSpicy(isSpicyCheckBox.isSelected());
                pizza.setSize(size);
                entityManager.persist(pizza);
                break;
            case "Spaghetti":
                Spaghetti spaghetti = new Spaghetti();
                spaghetti.setName(name);
                spaghetti.setOrigin(originField.getText());
                entityManager.persist(spaghetti);
                break;
            case "Gnocchi":
                Gnocchi gnocchi = new Gnocchi();
                gnocchi.setName(name);
                gnocchi.setSauce(sauceField.getText());
                entityManager.persist(gnocchi);
                break;
            default:
                throw new IllegalArgumentException("Nieprawidłowy typ dania: " + dishType);
        }

        entityManager.getTransaction().commit();
        entityManager.close();

        JOptionPane.showMessageDialog(this, dishType + " dodano pomyślnie");
    }
}
