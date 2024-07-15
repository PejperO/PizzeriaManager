import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class PizzeriaGUI extends JFrame {

    public PizzeriaGUI() {
        setTitle("Pizzeria System");
        setSize(800, 600); // Zwiększenie rozmiaru okna
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new CardLayout());

        // Ustawienie wyglądu Nimbus
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Dodanie paneli
        add(new AddDishPanel(), "AddDish");
        add(new AddIngredientPanel(), "AddIngredient");
        add(new OrderPanel(), "Order");
        add(new ModifyMenuPanel(), "ModifyMenu");

        // Wyświetlenie pierwszego panelu domyślnie
        CardLayout cl = (CardLayout) getContentPane().getLayout();
        cl.show(getContentPane(), "AddDish");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PizzeriaGUI gui = new PizzeriaGUI();
            gui.setVisible(true);
        });
    }
}


