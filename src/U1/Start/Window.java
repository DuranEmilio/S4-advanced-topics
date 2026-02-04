package U1.Start;

import javax.swing.*;

public class Window extends JFrame {
  private JLabel lbF,lbC; //TAGS
  private JTextField txtF, txtC; //TEXT FIELDS
  private JButton cleanBtn, convertBtn;

  public Window() {
    windowSettings();
  }

  private void windowSettings() {
    this.setSize(400, 200);
    this.setTitle("Conversor de temperaturas");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
  }

  private void initComponent() {

  }
}
