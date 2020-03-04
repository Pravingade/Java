public class Main
{
	public static void main(String[] args) 
	{
	    //boxing--variable to object conversion
		int i=10;
		float f=10.2f;
		char c='p';
		double d=234634545;
		boolean bn=true;
		Integer i1=new Integer(i);
		Integer i2=new Integer("34334");
		Integer i3=Integer.valueOf(i);
		Float f1=new Float(f);
		Float f2=Float.valueOf(f);
		Character c1=new Character(c);
		Double d1=new Double(d);
		Boolean bn1=new Boolean(bn);
		System.out.println(i+"  "+i1+"  "+i2+"  "+i3+"  "+f1+"  "+f2+"  "+c1+"  "+d1+"  "+bn1);
		
		//Unboxing--object to variable typecasting
		int j=i1.intValue();
		float k=f1.floatValue();
		char l=c1.charValue();
		double m=d1.doubleValue();
		System.out.println(j+"  "+k+"  "+l+"  "+m);
		
		// Integer to string typecasting 
		String s=i2.toString();
		s=s+10;
		System.out.println("s: "+s);
	}
}
