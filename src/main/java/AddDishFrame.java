import javax.swing.*;

public class AddDishFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Add Dish");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // glowny panel
        JPanel mainPanel = new JPanel(); // nowy JPanel
        frame.setContentPane(mainPanel); // ten panel jako main

        AddDishPanel addDishPanel = new AddDishPanel(mainPanel); // przekazanie referencji

        mainPanel.add(addDishPanel); // dodanie AddDishPanel do main

        frame.pack();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
