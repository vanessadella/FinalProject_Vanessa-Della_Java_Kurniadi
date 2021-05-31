import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
	JFrame frame;
	JButton button1 = new JButton("Insert");
	JButton button2 = new JButton("View");
	JButton button3 = new JButton("Update");
	JButton button4 = new JButton("Delete");
	JButton Start = new JButton("Start");
	JButton Exit = new JButton("Exit");
	
	public Main() {
		initframe();
	}

	public static void main(String[] args) {
		new Main();
	}
	

	public void initframe() {
		frame = new JFrame("BobaCool");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initlabel();
		initmenu();
		initmenubawah();
		frame.setLocation(400,200);
		frame.setVisible(true);
	}
	
	public void initlabel() {
		JLabel label = new JLabel("BobaCool");
	}
	
	public void initmenu() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
	}
	
	public void initmenubawah() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		Exit.addActionListener(this);
		Start.setBackground(Color.GREEN);
		Start.setOpaque(true);
		Start.setForeground(Color.GRAY);
		Exit.setBackground(Color.RED);
		Exit.setForeground(Color.GRAY);
		panel.add(Start);
		panel.add(Exit);
		frame.add(panel,BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button1)) {
			JOptionPane.showMessageDialog(null,"Create data");
			new form();
			frame.setVisible(false);
		} else if (e.getSource().equals(button2)) {
			new view();
			frame.setVisible(false);
		} else if (e.getSource().equals(button3)) {
			new update();
			frame.setVisible(false);
		} else if (e.getSource().equals(button4)) {
			new delete();
			frame.setVisible(false);
		} else if (e.getSource().equals(Exit)) {
			System.exit(0);
		}
	}
}