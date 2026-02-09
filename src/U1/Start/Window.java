package U1.Start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

  private JLabel lbF, lbC; //TAGS
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
    this.setLayout(new GridLayout(3, 2, 5, 5));
  }

  private void initComponent() {
    lbC = new JLabel("Grados celsius");
    lbF = new JLabel("Grados fahrenheit");

    txtC = new JTextField();
    txtF = new JTextField();

    convertBtn = new JButton("Convertir");
    convertBtn.addActionListener(this);
    cleanBtn = new JButton("Limpiar");
    cleanBtn.addActionListener(this);

    this.add(lbF);
    this.add(txtF);
    this.add(lbC);
    this.add(txtC);
    this.add(convertBtn);
    this.add(cleanBtn);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == convertBtn) {
      double f = 0, c = 0;
      try {
        if (!txtC.getText().isEmpty()) {
          f = Double.parseDouble(txtC.getText());
          c = (f - 32) * 5/9;
          txtF.setText(String.format("%.1f", c));
        } else if (!txtF.getText().isEmpty()) {
          c = Double.parseDouble(txtF.getText());
        }
      } catch (NumberFormatException ex) {

      }
    } else if (e.getSource() == cleanBtn) {
      txtC.setText("");
      txtF.setText("");
      txtF.requestFocus();
    }
  }
}
