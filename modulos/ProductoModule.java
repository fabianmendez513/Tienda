package modulos;

import java.awt.*;
import javax.swing.*;

public class ProductoModule extends JPanel {

    public ProductoModule(String urlImg, String nombre) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        setPreferredSize(new Dimension(150, 150));

        // Imagen
        JLabel imgLabel = new JLabel();
        ImageIcon icon = new ImageIcon(urlImg); // si es ruta local o URL
        Image img = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imgLabel.setIcon(new ImageIcon(img));
        imgLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Nombre
        JLabel nameLabel = new JLabel(nombre);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(imgLabel, BorderLayout.CENTER);
        add(nameLabel, BorderLayout.SOUTH);
    }
}
