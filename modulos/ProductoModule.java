package modulos;

import javax.swing.*;
import java.awt.*;

public class ProductoModule extends JPanel {

    public ProductoModule(String urlImg, String descripcion) {
        setPreferredSize(new Dimension(120, 120));
        setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
    }
}
