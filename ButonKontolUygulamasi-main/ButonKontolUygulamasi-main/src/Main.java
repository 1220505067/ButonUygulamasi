import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PanelOlustur panel = new PanelOlustur();
            panel.setVisible(true); // Panel görünür yapıldı.
        });
    }
}