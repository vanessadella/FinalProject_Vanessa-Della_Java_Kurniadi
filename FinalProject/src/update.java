import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;

public class update extends JFrame implements ActionListener {
	JFrame frame;
	JButton update = new JButton("Update");
	JButton exit = new JButton("Exit");
	JTable table;
	
	public update() {
		initframe();
	}
	
	public void initframe() {
		frame=new JFrame("Update Data");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400,100);
		frame.setVisible(true);
	}
