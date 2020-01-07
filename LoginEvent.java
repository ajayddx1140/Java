import java.awt.*;
import java.awt.event.*;
class LoginEvent{
	public static void main(String args[]){
		Frame f1 = new Frame();
		f1.setBounds(300,200,500,300);
		f1.setVisible(true);
		f1.setLayout(null);
		f1.setBackground(Color.RED);
		f1.setForeground(Color.blue);
		Button b1 = new Button("Login");
		b1.setBounds(220,180,60,20);
		TextField t1 = new TextField(30);
		TextField t2 = new TextField(30);
		t1.setBounds(230,80,120,20);
		t2.setBounds(230,120,120,20);
		Label l1 = new Label("Username");
		Label l2 = new Label("Password");
		l1.setBounds(140,80,60,20);
		l2.setBounds(140,120,60,20);
		Label l3 = new Label();
		l3.setBounds(100,210,300,20);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(t1.getText().equals("Utkarsh") && t2.getText().equals("abc"))
					l3.setText("Login Successful");
				else
					l3.setText("Wrong Password");
			}
		});
		
		f1.add(b1);
		f1.add(t1);
		f1.add(t2);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
	}
}
		