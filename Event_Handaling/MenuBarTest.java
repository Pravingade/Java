import javax.swing.*;
import java.awt.*;
class myLayout extends Jframe implements ActionListener
{
    JMenuBar mb;
    JMenu color,shape;
    JMenuItem r,g,b,rect,circ;
    color c;
    int i=0;
    myLayout()
    {
        this.SetLayout(null);
        mb=new JMenuBar();
        color=new JMenu("Color");
        shape=new JMenu("Shape");
        r=new JMenuItem("Red");
        g=new JMenuItem("Green");
        b=new JMenuItem("Blue");
        rect=new JMenuItem("Rectangle");
        circ=new JMenuItem("circle");
        
        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
        rect.addActionListener(this);
        circ.addActionListener(this);
        
        color.add(r);
        color.add(g);
        color.add(b);
        shape.add(rect);
        shape.add(circ);
        mb.add(color);
        mb.add(shape);
        this.setJMenuBar(mb);
        setSize(500,500);
        f.setVisible(true);
    }
    public void actionperformed(ActionEvent e)
    {
        if(e.getsource()==r)
        {
           c=color.RED;  
           repaint();
        }
        if(e.getsource()==g)
        {
           c=color.GREEN; //c=JcolorChoser.showdialog(this,"select color");  
           repaint();
        }
        if(e.getsource()==b)
        {
           c=color.BLUE;  
           repaint(); 
        }  
        if(e.getsource()==circ)
        {
            i=1;
            repaint();
        }
        if(e.getsource()==rect)
        {
           i=2;  
           repaint();
        }
        public void paint(Graphics g)
        {
            super.paint(g);
            if(i==1)
            {
                g.setcolor();
                g.drowoval(200,200,100,100);
            }
            if(i==2)
            {
                g.setcolor();
                g.drowoval(200,200,200,150);
            }
        }
    }  
}
public class Main
{
	public static void main(String[] args)
	{
	    
		myLayout m=new myLayout();
	}
}
