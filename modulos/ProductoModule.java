package modulos;

import java.awt.*;
import javax.swing.*;

public class ProductoModule extends JPanel {

    public ProductoModule(String urlImg, String descripcion) {
        setPreferredSize(new Dimension(120, 120));
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        setBackground(Color.GRAY);
    }
}
