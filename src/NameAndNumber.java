/**
 * @author Akira Morales
 * Period 6
 * Classwork GUI
 */
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class NameAndNumber {
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setBounds(300, 300, 500, 300);
		frame.setLayout(null);
		
		JTextField name = new JTextField("Enter name");
		name.setText(name.getText());
		name.setSize(100, 50);
		name.setLocation(new Point(250, 50));
		
		JTextField number = new JTextField("Enter Number");
		number.setText(number.getText());
		number.setSize(100, 50);
		number.setLocation(new Point(250, 100));
		
		JButton commandButton = new JLabel("Click to display");
		commandButton.setSize(100, 50);
		commandButton.setLocation(new Point(250, 150));
		
		
		frame.add(name);
		frame.add(number);
		frame.add(commandButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
