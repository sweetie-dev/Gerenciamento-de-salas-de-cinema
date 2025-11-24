import java.awt.*;
import javax.swing.border.Border;
import javax.swing.*;

/**
 * Borda simples que desenha uma sombra leve ao redor do componente.
 */
public class ShadowBorder implements Border {
    private final int size;
    private final Color color;
    private final int arc;

    public ShadowBorder(int size, Color color) {
        this(size, color, 12);
    }

    public ShadowBorder(int size, Color color, int arc) {
        this.size = Math.max(1, size);
        this.color = color;
        this.arc = arc;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(size, size, size, size);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (int i = 0; i < size; i++) {
            float frac = 1.0f - (float) i / (size + 1);
            int alpha = Math.max(6, Math.min( (int) (color.getAlpha() * frac), 255));
            Color cShadow = new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
            g2.setColor(cShadow);
            int pad = i;
            int w = width - pad * 2 - 1;
            int h = height - pad * 2 - 1;
            g2.fillRoundRect(x + pad, y + pad, w, h, arc, arc);
        }

        g2.dispose();
    }
}
