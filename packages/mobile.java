package mobile;

import mobile.android.lenovo;
import mobile.android.oneplus;
import mobile.android.redmi;
import mobile.windows.nokia;
import mobile.windows.samsung;

public class mobile 
{
	public static void main(String[] args) 
	{
          lenovo l=new lenovo("lenovo k6",125000,2);
          l.display();
          System.out.println(l);
          
          redmi r=new redmi("redmi note10",16999,3);
          r.display();
          System.out.println(r);
          
          oneplus o=new oneplus("oneplus 8T",41999,12);
          o.display();
          System.out.println(o);
	
          nokia n=new nokia("Nokia 8.1",26999,8);
          n.display();
          System.out.println(n);
          
          samsung s=new samsung("samsung note 20",1040999,12);
          s.display();
          System.out.println(s);
	}	

}

