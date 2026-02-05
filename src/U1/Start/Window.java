package U1.Start;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
  private JLabel lbF,lbC; //TAGS
  private JTextField txtF, txtC; //TEXT FIELDS
  private JButton cleanBtn, convertBtn; //BUTTONS

  public Window() {
    windowSettings();
    initComponent();
  }

  private void windowSettings() {
    this.setSize(400, 200);
    this.setTitle("Conversor de temperaturas");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(3,2,5,5));
  }

  private void initComponent() {
    lbC = new JLabel("Grados celsius");
    lbF = new JLabel("Grados fahrenheit");

    txtC = new JTextField();
    txtF = new JTextField();

    convertBtn = new JButton("Convertir");
    cleanBtn = new JButton("Limpiar");

    this.add(lbF);
    this.add(txtF);
    this.add(lbC);
    this.add(txtC);
    this.add(convertBtn);
    this.add(cleanBtn);
  }
}
