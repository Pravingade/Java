package IOStream;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class InputOutputStream 
{
	public static void main(String[] args) throws IOException
	{
         File d=new File("Test");
         File f=new File("Test/f2.txt");
         FileOutputStream fo=new FileOutputStream(f,true);
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter data to write in file: ");
         String data=sc.nextLine();
         byte []arr=data.getBytes();
         fo.write(arr);
         System.out.println("Writing completed.");
         
         FileInputStream fis=new FileInputStream(f);
         int ch;
         ch=fis.read();
         while(ch!=-1)
         {
        	 System.out.print((char)ch);
        	 ch=fis.read();
         }
         fis.close();
         System.out.println("\n reading completed.");
	}

}
