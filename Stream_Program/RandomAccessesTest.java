package RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class fileop
{
	RandomAccessFile rd;
	
	void writedata(File f,String m) throws IOException
	{
		rd=new RandomAccessFile(f,m);
		String data;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data : ");
		data=sc.nextLine();
		rd.writeBytes(data);
		rd.close();
	}
		
		void readdata(File f,String m) throws IOException
		{
			rd=new RandomAccessFile(f,m);
            int ch;
            System.out.println("Possition: "+rd.getFilePointer());
            System.out.println("Length: "+rd.length());
            rd.seek(13);
            
            while((ch=rd.read())!=-1)
            {
            	System.out.println((char)ch);
            }
            System.out.println("Reading done...");
            System.out.println("position"+rd.getFilePointer());
		}

}
public class RandomAccessesTest {

	public static void main(String[] args) throws IOException
	{
         File f=new File("Test/f5.txt");
         fileop o=new fileop();
         o.writedata(f, "rw");
         o.readdata(f,"r");
	}

}
