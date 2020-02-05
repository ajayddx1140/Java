import java.awt.*;
class Test1 extends Frame
{
	Test1()
	{
		setBounds(500,400,500,300);
		setVisible(true);
		setLayout(null);
		Label l1 = new Label("Name");
		Label l2 = new Label("Password");
		TextField f1 = new TextField();
		TextField f2 = new TextField();
		
		l1.setBounds(50,50,100,30);
		f1.setBounds(180,50,100,30);
		
		l2.setBounds(50,120,100,30);
		f2.setBounds(180,120,100,30);
		
		Button b1 = new Button("Submit");
		b1.setBounds(100,180,70,30);
		Button b2 = new Button("Reset");
		b2.setBounds(200,180,70,30);
		add(l1);
		add(f1);
		add(l2);
		add(f2);
		add(b1);
		add(b2);
		
	}
	
	public static void main(String s[])
	{
		new Test1();
		
	}
}