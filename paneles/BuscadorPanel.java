package paneles;

import javax.swing.*;
import java.awt.*;

public class BuscadorPanel extends JPanel {

    public BuscadorPanel() {
        setBackground(Color.RED);

        JLabel lblBuscar = new JLabel("Buscar:");
        JTextField txtBuscar = new JTextField(10);
        JButton btnBuscar = new JButton("OK");


        add(lblBuscar);
        add(txtBuscar);
        add(btnBuscar);
    }
}
