import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.*;

public class view extends JFrame implements ActionListener{
	JButton exit;
	
	public void tabel() {
		initframe();
	}
	
	public void initframe() {
		setTitle("View");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400,100);
		setVisible(true);
	}
	

	public void komponen() {
		exit = new JButton("Exit");
		exit.addActionListener(this);
		JPanel bawah = new JPanel();
		bawah.setLayout(new FlowLayout());
		bawah.add(exit);
		add(bawah);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(exit)) {
			new Main();
			setVisible(false);
		}
	}
}