{
	public static void main(String[] args) 
	{
	    //StringBuffer sb=new StringBuffer("Profound ");
	    StringBuilder sb=new StringBuilder("Pravin");
	    sb.append(" Edutech ");
	    System.out.println(sb);
	    
	    sb.replace(9,12,"Angular");
	    System.out.println(sb);
	  
	    System.out.println("Index of f: "+sb.indexOf("f"));
	    System.out.println(sb);
	    
	    sb.insert(8,"Hi");
	    System.out.println(sb);
	    
	    sb.delete(8,12);
	    System.out.println(sb);
	    
	    sb.reverse();
	    System.out.println(sb);
	}
}
