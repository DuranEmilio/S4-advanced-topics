package U1.Add;
import java.awt.Button;
import java.awt.event.ActionEvent; //Trigger Events
import java.awt.event.ActionListener; //Listener Events
import javax.swing.*;

public class Add extends JFrame{
    JFrame frame = new JFrame();

  Add() {
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Full view port
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app action
    frame.setLocationRelativeTo(null); // Clicker
    frame.setLayout(null); // Manual administration
  }

  JButton AddButton = new JButton("Add");
  JButton RootButton = new JButton("Square Root");
  JButton Clean = new JButton("Clean");

  public static void main(String[] args) {

  }
}
