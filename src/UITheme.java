import javax.swing.*;
import java.awt.*;

/**
 * Aplica um tema moderno simples usando Nimbus + ajustes de UIManager.
 */
public class UITheme {
    public static void apply() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // fallback silencioso
        }

        // Cores e fontes modernas
        Font base = new Font("Segoe UI", Font.PLAIN, 13);
        Color royal = new Color(65, 105, 225); // RoyalBlue
        UIManager.put("control", new Color(245, 247, 250)); // background geral
        UIManager.put("info", new Color(245, 247, 250));
        UIManager.put("nimbusBase", new Color(40, 44, 52));
        UIManager.put("nimbusBlueGrey", new Color(100, 116, 139));
        UIManager.put("nimbusFocus", new Color(90, 120, 200));
        UIManager.put("Panel.background", new Color(245, 247, 250));
        UIManager.put("Label.font", base);
        UIManager.put("Label.foreground", royal);
        // Use a symbol-capable font for buttons so Unicode glyphs show correctly on Windows
        Font btnFont = new Font("Segoe UI Symbol", Font.BOLD, 13);
        if (!btnFont.getFamily().equals("Segoe UI Symbol")) {
            // fallback: try Segoe UI Emoji
            btnFont = new Font("Segoe UI Emoji", Font.BOLD, 13);
        }
        UIManager.put("Button.font", btnFont);
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Button.foreground", royal);
        UIManager.put("Button.border", new javax.swing.border.CompoundBorder(
            new javax.swing.border.LineBorder(new Color(220,220,220), 1, true),
            javax.swing.BorderFactory.createEmptyBorder(6,12,6,12)));
        UIManager.put("ToggleButton.font", base);
        UIManager.put("TextField.font", base);
        UIManager.put("ComboBox.font", base);
        UIManager.put("Table.font", base);
        UIManager.put("Table.background", Color.WHITE);
        UIManager.put("Table.selectionBackground", new Color(200, 220, 255));
        UIManager.put("TabbedPane.background", new Color(245,247,250));

        // Tweaks for Nimbus specific properties (some may be ignored by other LAFs)
        UIManager.put("nimbusOrange", royal);
        UIManager.put("nimbusSelectionBackground", new Color(200, 220, 255));

        // Optional: rounded borders for text fields (Nimbus key)
        UIManager.put("TextField.background", Color.WHITE);
        UIManager.put("TextField.inactiveBackground", Color.WHITE);

        // Button text/icon gap
        UIManager.put("Button.iconTextGap", 8);

        // Apply change to any already created components
        for (Window w : Window.getWindows()) {
            SwingUtilities.updateComponentTreeUI(w);
            // Percorre e aplica sombra nos botões para criar o efeito de "quadrado branco com sombra".
            applyShadowToChildren(w, royal);
        }
    }

    private static void applyShadowToChildren(Component comp, Color royal) {
        if (comp instanceof JButton) {
            JButton b = (JButton) comp;
            b.setOpaque(true);
            b.setBackground(Color.WHITE);
            b.setForeground(royal);
            b.setFocusPainted(false);
            b.setBorder(new ShadowBorder(6, new Color(0,0,0,36)));
        }
        if (comp instanceof Container) {
            for (Component c : ((Container) comp).getComponents()) {
                applyShadowToChildren(c, royal);
            }
        }
    }
}
