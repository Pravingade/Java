import javax.swing.*;
import java.awt.*;
class myLayout
{
    myLayout()
    {
    JFrame f=new JFrame("My First Frame");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500,500);
    JButton b1,b2;
    b1=new JButton("Submit");
    b2=new JButton("Reset");
    f.add(b1);
    f.add(b2);
    f.setVisible(true);
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    
		myLayout m=new myLayout();
	}
}
