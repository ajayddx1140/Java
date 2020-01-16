import java.awt.*;
import java.awt.event.*;

class SetColor{
	public static void main(String args[]){
		final Frame f1 = new Frame();
		f1.setBounds(300,200,500,300);
		f1.setVisible(true);
		f1.setLayout(null);
		Button b1 = new Button("RED");
		Button b2 = new Button("GREEN");
		Button b3 = new Button("YELLOW");
		b1.setBounds(100,140,70,30);
		b2.setBounds(200,140,70,30);
		b3.setBounds(300,140,70,30);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f1.setBackground(Color.RED);
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f1.setBackground(Color.GREEN);
			}
		});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f1.setBackground(Color.YELLOW);
			}
		});
		
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
	}
}
	
	