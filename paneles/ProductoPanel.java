package paneles;

import java.awt.*;
import javax.swing.*;
import modulos.ProductoModule;

public class ProductoPanel extends JPanel {

    public ProductoPanel() {
        setLayout(new GridLayout(2, 4, 10, 10)); // 2 filas x 4 columnas
        setBorder(BorderFactory.createTitledBorder("Productos"));

        ProductoModule producto1 = new ProductoModule("url1", "Producto 1");
        ProductoModule producto2 = new ProductoModule("url2", "Producto 2");
        ProductoModule producto3 = new ProductoModule("url3", "Producto 3");
        ProductoModule producto4 = new ProductoModule("url4", "Producto 4");
        ProductoModule producto5 = new ProductoModule("url5", "Producto 5");
        ProductoModule producto6 = new ProductoModule("url6", "Producto 6");
        ProductoModule producto7 = new ProductoModule("url7", "Producto 7");
        ProductoModule producto8 = new ProductoModule("url8", "Producto 8");

        add(producto1);
        add(producto2);
        add(producto3);
        add(producto4);
        add(producto5);
        add(producto6);
        add(producto7);
        add(producto8);
    }
}
