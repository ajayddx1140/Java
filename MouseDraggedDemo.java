import java.awt.*;

import java.awt.event.*;

class MouseDraggedDemo extends MouseMotionAdapter
{
Frame f;

public MouseDraggedDemo()
{
f=new Frame();
f.setSize(400,400);
f.setVisible(true);

f.addMouseMotionListener(this);
}
public void mouseDragged(MouseEvent e)
{
int x,y;
x=e.getX();y=e.getY();

Graphics g=f.getGraphics();

g.setColor(Color.red);
g.drawLine(0,0,x,y);
g.setColor(Color.green);
g.drawLine(399,0,x,y);
g.setColor(Color.blue);
g.drawLine(0,399,x,y);
g.setColor(Color.yellow);
g.drawLine(399,399,x,y);

System.out.print("Ekta");
}
public static void main(String args[])
{
MouseDraggedDemo d=new MouseDraggedDemo();
}
}
