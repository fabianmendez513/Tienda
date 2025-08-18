package vistas;

import java.awt.*;
import javax.swing.*;
import paneles.BuscadorPanel;
import paneles.ProductoPanel;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        BuscadorPanel buscador = new BuscadorPanel();
        panelPrincipal.add(buscador, BorderLayout.WEST);

        ProductoPanel productos = new ProductoPanel();
        panelPrincipal.add(productos, BorderLayout.CENTER);

        add(panelPrincipal);
        setVisible(true);
    }
}
