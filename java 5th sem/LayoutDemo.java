import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutDemo extends JFrame {
  // Declare buttons for the different layout managers
  JButton flowButton, borderButton, gridButton, gridBagButton;

  public LayoutDemo() {
    // Set the window title
    super("Layout Manager Demo");

    // Set the layout to border layout
    setLayout(new BorderLayout());

    // Create a panel for the flow layout
    JPanel flowPanel = new JPanel();
    flowPanel.setLayout(new FlowLayout());

    // Create a panel for the border layout
    JPanel borderPanel = new JPanel();
    borderPanel.setLayout(new BorderLayout());

    // Create a panel for the grid layout
    JPanel gridPanel = new JPanel();
    gridPanel.setLayout(new GridLayout(3, 2));

    // Create a panel for the grid bag layout
    JPanel gridBagPanel = new JPanel();
    gridBagPanel.setLayout(new GridBagLayout());

    // Create the buttons
    flowButton = new JButton("Flow Layout");
    borderButton = new JButton("Border Layout");
    gridButton = new JButton("Grid Layout");
    gridBagButton = new JButton("Grid Bag Layout");

    // Add the buttons to the appropriate panels
    flowPanel.add(flowButton);
    borderPanel.add(borderButton, BorderLayout.NORTH);
    gridPanel.add(gridButton);
    gridBagPanel.add(gridBagButton, new GridBagConstraints());

    // Add the panels to the main window
    add(flowPanel, BorderLayout.NORTH);
    add(borderPanel, BorderLayout.SOUTH);
    add(gridPanel, BorderLayout.EAST);
    add(gridBagPanel, BorderLayout.WEST);

    // Set the size and show the window
    setSize(400, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new LayoutDemo();
  }
}
