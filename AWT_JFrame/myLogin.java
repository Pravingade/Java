package AWToolkit;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myLogin extends Frame
{
	Button b1,b2;
    Label l1,l2;
    TextField t1,t2;
    public myLogin()
    {
   	    this.setLayout(null);
   	    l1=new Label("Name: ");
   	    l2=new Label("Address: ");
   	    t1=new TextField();
   	    t2=new TextField();
   	    b1=new Button("Submit");
   	    b2=new Button("Reset");
   	    
   	              // x, y, h,  w
   	    l1.setBounds(10,50,100,30);
   	    t1.setBounds(150,50,100,30);
   	    l2.setBounds(10,100,100,30);
   	    t2.setBounds(150,100,100,30);
   	    b1.setBounds(10,150,100,30);
   	    b2.setBounds(150,150,100,30);
   	    
   	    add(l1);   add(l2);
   	    add(t1);   add(t2);
   	    add(b1);   add(b2);
   	    
   	    addWindowListener(new WindowAdapter()      // this method is used for closing the output window
   	    {
   	    public void windowClosing(WindowEvent e)
   	    {
   	    	super.windowClosed(e);
   	    	dispose();
   	    }
   	    });
   	    
   	    
   	    setVisible(true);
   	    setSize(500,500);
    }
	public static void main(String[] args) 
	{
         new myLogin();
	}

}
