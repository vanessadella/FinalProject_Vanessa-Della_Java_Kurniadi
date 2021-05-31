import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class delete extends JFrame implements ActionListener {
	JFrame frame;
	JButton delete = new JButton("Delete");
	JButton exit = new JButton("Exit");
	JTable table;
	
	public delete() {
		initframe();
	}
	
	public void initframe() {
		frame=new JFrame("Delete");
		frame.setSize(400, 400);
		initlabel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400,100);
		frame.setVisible(true);
	}
	
	public void initlabel() {
		JLabel label = new JLabel("Row to delete");
		label.setHorizontalAlignment(label.CENTER);
		label.setFont(new Font(null, Font.PLAIN, 14));
		frame.add(label, BorderLayout.NORTH);
	}
	

