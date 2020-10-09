package AWToolkit;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;

public class myframe extends Frame
{
	myframe()
	{
		Frame f=new Frame("my First frame");
		f.setLayout(null);
		Label l1=new Label("Enter your name: ");
		TextField t1=new TextField();
		Button b1=new Button("Submit");
		l1.setBounds(10,10,100,150);
		t1.setBounds(250,50,100,50);
		b1.setBounds(150, 150, 100, 50);
		f.add(l1);
		f.add(t1);
		f.add(b1);
		
		addWindowListener(new WindowAdapter()      // this method is used for closing the output window
		   	    {
		   	    public void windowClosing(WindowEvent e)
		   	    {
		   	    	super.windowClosed(e);
		   	    	dispose();
		   	    }
		   	    });
		f.setVisible(true);
		f.setSize(500, 500);
	}
	public static void main(String[] args) 
	{
         new myframe();
	}

}
