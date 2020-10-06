package ReaderWriterStream;

import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class ReaderWriterTest  
{
	public static void main(String[] args) throws IOException
	{
         File f=new File("Test/f2.txt");
         BufferedWriter bw=new BufferedWriter(new FileWriter(f));
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter data to write in file: ");
         String data=sc.nextLine();
         bw.write(data);
         bw.flush();
         bw.close();
         System.out.println("Writing completed.");
         
         FileReader fr=new FileReader(f);
         int ch;
         ch=fr.read();
         while(ch!=-1)
         {
        	 System.out.print((char)ch);
        	 ch=fr.read();
         }
         fr.close();
         System.out.println("\n reading completed.");
	}

}
