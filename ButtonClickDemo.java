import java.awt.*;
import java.awt.event.*;

class ButtonClickDemo extends Frame implements ActionListener
{
Button cb;

public ButtonClickDemo()
{
cb= new Button("Bharat");
cb.addActionListener(this);
cb.setBackground(Color.pink);
cb.setForeground(Color.blue);
cb.setFont(new Font("Arial",Font.BOLD,16));
add(cb,"Center");
setSize(300,300);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("Bharat"))
cb.setLabel("India");
else if(str.equals("India"))
cb.setLabel("Bharat");
String str1=cb.getLabel();
System.out.println("you clicked"+str1);
}
public static void main(String args[])
{
new ButtonClickDemo();
}
}