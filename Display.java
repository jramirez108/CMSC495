import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Display {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Reminder Application");
 
                        PasswordChecker loginScreen = new PasswordChecker(frame);
                        loginScreen.setVisible(true);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}