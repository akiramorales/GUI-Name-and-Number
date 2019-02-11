/**
 * @author Akira Morales
 * Period 6
 * Classwork GUI
 */
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class NameAndNumber {
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setBounds(300, 300, 500, 300);
		frame.setLayout(null);
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(25, 25, 100, 25);
		JTextField nameText = new JTextField();
		nameText.setBounds(100, 25, 100, 25);
		JLabel numberLabel = new JLabel("Number");
		numberLabel.setBounds(25, 50, 100, 25);
		JTextField numberText = new JTextField();
		numberText.setBounds(100, 50, 100, 25);
		
		
		JButton commandButton = new JButton("Click to display");
		commandButton.setSize(200, 50);
		commandButton.setLocation(new Point(250, 150));
		commandButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent calculate)
			{
				nameLabel.setText(nameText.getText());
				numberLabel.setText(numberText.getText());
			}
		});
		
		
		frame.add(nameLabel);
		frame.add(nameText);
		frame.add(numberLabel);
		frame.add(numberText);
		frame.add(commandButton);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
