import java.awt.*;

class StudentRegistration extends Frame
{
	Button b = new Button("Save");
		Label l = new Label("Student Details");
		Label l1 = new Label("Name:");
		Label l2 = new Label("Age:");
		Label l3 = new Label("Sex(M/F):");
		Label l4 = new Label("Address:");
		Label l5 = new Label("Course:");
		Label l6 = new Label("Semester:");
		
		TextField t1 = new TextField();
		
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Male",false,cbg);
		Checkbox cb2 = new Checkbox("Female",false,cbg);
		
		TextArea ta1 = new TextArea(" ",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		Choice course = new Choice();
		Choice sem = new Choice();
		Choice age = new Choice();
		
	StudentRegistration()
	{
		setLayout(null);
		add(l);add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
		add(t1);add(ta1);add(cb1);add(cb2);add(course);add(sem);add(age);add(b);
		
		course.add("CS");
		course.add("FT");
		course.add("BT");
		course.add("CH");
		
		age.add("17");
		age.add("18");
		age.add("19");
		age.add("20");
		age.add("21");
		age.add("22");
		age.add("23");
		
		sem.add("1");
		sem.add("2");
		sem.add("3");
		sem.add("4");
		sem.add("5");
		sem.add("6");
		sem.add("7");
		sem.add("8");
		
		l.setBounds(250,40,100,20);
		l1.setBounds(25,65,90,20);
		l2.setBounds(25,90,90,20);
		l3.setBounds(25,120,90,20);
		l4.setBounds(25,185,90,20);
		l5.setBounds(25,260,90,20);
		l6.setBounds(25,290,90,20);
		t1.setBounds(120,65,170,20);
		ta1.setBounds(120,180,170,60);
		cb1.setBounds(120,120,50,20);
		cb2.setBounds(170,120,60,20);
		course.setBounds(120,260,100,20);
		sem.setBounds(120,290,100,20);
		age.setBounds(120,90,80,20);
		b.setBounds(120,350,50,30);
		
		setForeground(Color.red);
	}
	
	public static void main(String s[])
	{
		StudentRegistration sr = new StudentRegistration();
	
		sr.setVisible(true);
		sr.setSize(new Dimension(600,600));
		sr.setTitle("Student Registration Form");
		sr.setBackground(Color.blue);
	}
}