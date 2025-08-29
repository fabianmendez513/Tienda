package vistas;

import java.awt.*;
import javax.swing.*;
import paneles.BuscadorPanel;
import paneles.ProductoPanel;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Tienda en Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(2100, 1500); 
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Panel izquierda (buscador o banner)
        BuscadorPanel banner = new BuscadorPanel();
        add(banner.getBanner(), BorderLayout.WEST); // usa el método correcto de tu clase

        // Panel derecha
        JPanel panelDerecha = new JPanel(new BorderLayout());

        JLabel lblProducto = new JLabel("Productos");
        lblProducto.setForeground(Color.BLACK);
        lblProducto.setFont(new Font("Arial", Font.BOLD, 22));
        lblProducto.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelDerecha.add(lblProducto, BorderLayout.NORTH);

        // Aquí usamos ProductoPanel (que ya arma los 8 productos en grilla)
        ProductoPanel productosPanel = new ProductoPanel();
        panelDerecha.add(productosPanel, BorderLayout.CENTER);

        add(panelDerecha, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
