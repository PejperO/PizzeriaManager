import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MainMenuGUI extends JFrame {

    public MainMenuGUI() {
        setTitle("Menu Główne");
        setSize(800, 600); // Rozmiar okna
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        //setBorder(new EmptyBorder(10, 10, 10, 10));

        // Ustawienie wyglądu Nimbus
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Dodanie panelu
        add(new MainMenuPanel(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenuGUI gui = new MainMenuGUI();
            gui.setVisible(true);
        });
    }
}
