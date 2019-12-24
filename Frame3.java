import java.awt.*;
import java.awt.event.*;

class Frame3 extends Frame
{
	 public Frame3(){
      super("WELCOME PAGE");
      prepareGUI();
   }

   public static void main(String[] args){
      Frame3  f3 = new Frame3();  
      f3.setVisible(true);
   }

   private void prepareGUI(){
      setSize(600,400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
	  
      Font boldFont = new Font("Times New Roman", Font.BOLD, 40);        
      g2.setFont(boldFont);
      g2.drawString("SELECTION", 50, 70); 
      Font boldFont2 = new Font("Times New Roman", Font.BOLD, 16);        
      g2.setFont(boldFont2);
      g2.drawString("ALREADY HAVE AN ACCOUNT   CREATE NEW ACCOUNT", 50, 200); 
	  
	  Button b1 = new Button("SIGNIN");
	  b1.setBounds(100,300,70,30);
	  
	  Button b2 = new Button("SIGNUP");
	  b2.setBounds(200,300,70,30);
	  
	  Button b3 = new Button("Back");
	  b3.setBounds(150,350,70,30);
	  
	  
	  add(b1);
	  add(b2);
	  add(b3);
   }
}
