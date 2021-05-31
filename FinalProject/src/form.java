import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Vector;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class form extends JFrame implements ActionListener {
	JButton savebutton = new JButton("Save");
	JButton cancelbutton = new JButton("Cancel");

	public form() {
		initframe();
	}
	
	public void initframe() {
		setTitle("Create Data");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0,1));
		setLocation(400,100);
		setVisible(true);
	}
	