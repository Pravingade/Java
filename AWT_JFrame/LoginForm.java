package SwingToolkit;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

class RegForm extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	JRadioButton rb1,rb2;
	JCheckBox ch1,ch2,ch3;
	
	RegForm()
	{
		this.setLayout(null);
		l1=new JLabel("name ");
		l2=new JLabel("password ");
		t1=new JTextField();
		p1=new JPasswordField();
		b1=new JButton("Submit");
		b2=new JButton("Reset");

   	    l1.setBounds(10,10,100,30);
   	    t1.setBounds(150,10,100,30);
   	    l2.setBounds(10,50,100,30);
   	    p1.setBounds(150,50,100,30);
   	    b1.setBounds(10,100,100,30);
   	    b2.setBounds(150,100,100,30);
   	    add(l1);   add(l2);
	    add(t1);   add(p1);
	    add(b1,BorderLayout.CENTER);   add(b2);

		l3=new JLabel("Select Gender ");
        rb1=new JRadioButton("male ");
        rb2=new JRadioButton("female ");
        l3.setBounds(10, 150, 100, 30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        rb1.setBounds(10, 200, 100, 30);
        rb2.setBounds(150, 200, 100, 30);
        add(l3); add(rb1); add(rb2);
        
        l4=new JLabel("Select Language ");
        ch1=new JCheckBox("C Language");
        ch2=new JCheckBox("C++ Language");
        ch3=new JCheckBox("Java Language");
        l4.setBounds(10, 250, 100, 30);
        ch1.setBounds(10, 300, 100, 30);
        ch2.setBounds(150, 300, 100, 30);
        ch3.setBounds(300, 300, 100, 30);
        add(l4);  add(ch1);
        add(ch2); add(ch3);
        
        addWindowListener(new WindowAdapter()      // this method is used for closing the output window
        {
        public void windowClosing(WindowEvent e)
        {
        	super.windowClosed(e);
        	dispose();
       	}
        });

        setVisible(true);
        setSize(700,700);
	}
}
public class LoginForm 
{
	public static void main(String[] args) 
	{
         new RegForm();
	}

}
