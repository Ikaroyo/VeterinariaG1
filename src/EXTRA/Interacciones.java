package EXTRA;

import VISTAS.Ficha_VISITAS;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Interacciones extends JLabel {


    public static void mouseEnterComponent(JLabel componente) {
        // mouse listener
        componente.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                componente.setLocation(componente.getLocation().x - 3, componente.getLocation().y - 3);
                componente.setSize(componente.getSize().width + 6, componente.getSize().height + 6);

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                componente.setLocation(componente.getLocation().x + 3, componente.getLocation().y + 3);
                componente.setSize(componente.getSize().width - 6, componente.getSize().height - 6);
            }
        });

    }



}
