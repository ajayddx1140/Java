import java.awt.*;

class LogIn
{
	public static void main(String s[])
	{
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(300,300);
		f.setTitle("LogIn Page");
		f.setBackground(Color.red);
		f.setLayout(null);
		
		Label l1 = new Label("UserName");
		Label l2 = new Label("Password");
		
		TextField t1 = new TextField(30);
		TextField t2 = new TextField(30);
		
		t2.setEchoChar('*');
		//t2.setEditable(false);
		
		Button b = new Button("LogIn");
		
		l1.setBounds(100, 100, 200, 30);
		t1.setBounds(350,100,400,30);
		l2.setBounds(100, 180, 200, 30);
		t2.setBounds(350,180,400,30);
		b.setBounds(250, 270, 100, 30);
		
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b);
		
		f.setForeground(Color.blue);
		
	}
}