import java.awt.*;
import java.awt.event.*;

public class MenuExample extends Frame {
  MenuExample() {
    // create a menu bar
    MenuBar menuBar = new MenuBar();
    setMenuBar(menuBar);

    // create menus
    Menu fileMenu = new Menu("File");
    Menu editMenu = new Menu("Edit");
    Menu helpMenu = new Menu("Help");

    // add menus to the menu bar
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(helpMenu);

    // create menu items
    MenuItem newItem = new MenuItem("New");
    MenuItem openItem = new MenuItem("Open");
    MenuItem saveItem = new MenuItem("Save");
    MenuItem exitItem = new MenuItem("Exit");

    MenuItem cutItem = new MenuItem("Cut");
    MenuItem copyItem = new MenuItem("Copy");
    MenuItem pasteItem = new MenuItem("Paste");

    MenuItem aboutItem = new MenuItem("About");

    // add menu items to the menus
    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.addSeparator();
    fileMenu.add(exitItem);

    editMenu.add(cutItem);
    editMenu.add(copyItem);
    editMenu.add(pasteItem);

    helpMenu.add(aboutItem);

    // add action listeners to the menu items
    exitItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    aboutItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("This is a menu example");
      }
    });
  }

  public static void main(String[] args) {
    MenuExample frame = new MenuExample();
    frame.setTitle("Menu Example");
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
