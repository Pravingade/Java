package IOStream;

import java.io.*;

public class FileTest
{
	public static void main(String[] args) throws IOException
	{
		File d=new File("Test");
		File f=new File("Test/f2.txt");
		if(!d.exists())
		{
			d.mkdir();
			System.out.println("Directory is created.");
		}
		
        if(!f.exists())
        {
        	f.createNewFile();
        	System.out.println("File is created.");
        }
	}

}
