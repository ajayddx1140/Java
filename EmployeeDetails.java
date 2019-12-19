import java.awt.*;
import javax.swing.*;

public class EmployeeDetails {
	
	static JTextField t1,t2,t3;

	EmployeeDetails()
	{
	JFrame J = new JFrame("Employees Details");
	
	JLabel l1 = new JLabel("Emp_id: ");
	l1.setBounds(100, 100, 200, 30);
	t1 = new JTextField();
	t1.setBounds(350,100,400,30);
	
	
	JLabel l2 = new JLabel("Name: ");
	l2.setBounds(100, 180, 200, 30);
	t2 = new JTextField();
	t2.setBounds(350,180,400,30);
	
	JLabel l3 = new JLabel("Salary: ");
	l3.setBounds(100, 260, 200, 30);
	t3 = new JTextField();
	t3.setBounds(350,260,400,30);
	
	JButton B = new JButton("Submit");
	B.setBounds(200, 350, 100, 30);
	
	JButton B1 = new JButton("Show");
	B1.setBounds(400, 350, 100, 30);
	
	
	J.add(l1);
	J.add(t1);
	J.add(l2);
	J.add(t2);
	J.add(l3);
	J.add(t3);
	J.add(B);
	J.add(B1);
	
	J.setLayout(null);
	J.setSize(800,600);
	J.setVisible(true);
	J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new EmployeeDetails();
	}
}
