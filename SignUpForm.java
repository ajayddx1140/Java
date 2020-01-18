import java.awt.*;
import javax.swing.*;

class SignUpForm
{
	
	TextField t1,t2,t3,t4,t5,t6;
	JFrame f1;
	
	SignUpForm()
	{
		f1 = new JFrame();
		
		f1.setSize(600,600);
		f1.setVisible(true);
		f1.setLayout(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label l1 = new Label("Name");
		Label l2 = new Label("Phone no");
		Label l3 = new Label("Email");
		Label l4 = new Label("Username");
		Label l5 = new Label("Password");
		Label l6 = new Label("Confirm Password");
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		t6 = new TextField();
		
		Button b1 = new Button("Back");
		Button b2 = new Button("Signup");
		
		l1.setBounds(50,50,120,30);
		t1.setBounds(220,50,200,30);
		
		l2.setBounds(50,100,120,30);
		t2.setBounds(220,100,200,30);
		
		l3.setBounds(50,150,120,30);
		t3.setBounds(220,150,200,30);
		
		l4.setBounds(50,200,120,30);
		t4.setBounds(220,200,200,30);
		
		l5.setBounds(50,250,120,30);
		t5.setBounds(220,250,200,30);
		
		l6.setBounds(50,300,120,30);
		t6.setBounds(220,300,200,30);
		
		b1.setBounds(70,400,80,30);
		b2.setBounds(250,400,80,30);
		
		
		
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		f1.add(t1);
		f1.add(t2);
		f1.add(t3);
		f1.add(t4);
		f1.add(t5);
		f1.add(t6);
		f1.add(b1);
		f1.add(b2);
		
	}
	
	public static void main(String args[])
	{
		new SignUpForm();
	}
}
