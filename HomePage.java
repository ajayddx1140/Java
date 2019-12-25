import java.awt.*;
import javax.swing.*;

public class HomePage {
	
	static Menu m1,m2,m3,m4;
	static JFrame f;

	public static void main(String args[])
	{
     f= new JFrame("Boutique Management");  
     
     MenuBar mb=new MenuBar();
     
     m1=new Menu("Designs");
     m2=new Menu("Taylors");  
     m3=new Menu("Employees");  
     m4=new Menu("Customers");
     mb.add(m1);
     mb.add(m2);
     mb.add(m3);
     mb.add(m4);
     f.setMenuBar(mb);
     
     ImageIcon icon = new ImageIcon("C:\\Users\\ASHISH MATHUR\\Pictures\\Boutique\\K2.jpg");
     JLabel label = new JLabel(icon);
     f.add(label);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.pack();
     
     f.setSize(1200,600);  
     f.setLayout(null);  
     f.setVisible(true);  

	}
	
}