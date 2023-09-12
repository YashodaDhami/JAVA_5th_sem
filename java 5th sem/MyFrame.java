import java.awt.Frame;
import java.awt.Label;

public class MyFrame extends Frame {
  public MyFrame() {
    // Set the size and title of the frame
    setSize(400, 200);
    setTitle("My Frame Window");

    // Add a label with your name, section, and roll number
    Label label = new Label("Name: Yashoda Dhami, Section: A, Roll No: 11080/19");
    add(label);
  }

  public static void main(String[] args) {
    // Create a new frame and make it visible
    MyFrame frame = new MyFrame();
    frame.setVisible(true);
  }
}