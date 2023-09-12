
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWTFrame extends Frame {
  public AWTFrame() {
    // Set the size and title of the frame
    setSize(400, 200);
    setTitle("My Frame Window");
    setLayout(null);

    // Add a label
    Label label = new Label("Enter your name:");
    add(label);

    // Add a text field
    TextField textField = new TextField(20);
    add(textField);

    // Add a checkbox group
    CheckboxGroup group = new CheckboxGroup();
    Checkbox checkbox1 = new Checkbox("Option 1", group, false);
    Checkbox checkbox2 = new Checkbox("Option 2", group, true);
    Checkbox checkbox3 = new Checkbox("Option 3", group, false);
    add(checkbox1);
    add(checkbox2);
    add(checkbox3);
    label.setBounds(50, 50, 100, 30);
    textField.setBounds(150, 50, 100, 30);
    checkbox1.setBounds(50, 100, 100, 30);
    checkbox2.setBounds(150, 100, 100, 30);
    checkbox3.setBounds(250, 100, 100, 30);

    // Add a button

  }

  public static void main(String[] args) {
    // Create a new frame and make it visible
    AWTFrame frame = new AWTFrame();
    frame.setVisible(true);
  }
}
