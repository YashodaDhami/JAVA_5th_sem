import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApplet1 extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, subtract;

    public void init() {
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);
        add = new Button("Add");
        subtract = new Button("Subtract");

        add(num1);
        add(num2);
        add(result);
        add(add);
        add(subtract);

        add.addActionListener(this);
        subtract.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n1, n2, res;

        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());

        if (e.getSource() == add) {
            res = n1 + n2;
        } else {
            res = n1 - n2;
        }

        result.setText(String.valueOf(res));
    }
}
/*
 * <applet CODE="CalculatorApplet.class" WIDTH=800 HEIGHT=800>
 * </applet>
 */