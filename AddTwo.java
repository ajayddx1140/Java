import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AddTwo extends Frame implements ActionListener
{
String msg;
TextField num1, num2, res;
Label l1, l2, l3;
Button sum;
public AddTwo()
{
l1 = new Label("Number 1");
l2 = new Label("Number 2");
l3 = new Label("result");
num1 = new TextField(10);
num2 = new TextField(10);
res = new TextField(30);
sum = new Button("Add");
sum.addActionListener(this);
add(l1);
add(num1);
add(l2);
add(num2);
add(l3);
add(res);
add(sum);
setVisible(true);
setSize(800,800);
setLayout(new FlowLayout());
}
public void actionPerformed(ActionEvent ae)
{

int n1 = Integer.parseInt(num1.getText());
int n2 = Integer.parseInt(num2.getText());
int num3 = n1 + n2;
System.out.println("Result of Adding Two no is :");
res.setText(String.valueOf(num3));


}

public static void main(String args[])
{
	new AddTwo();
	
}
}
