package DataIOStream;
import java.io.*;
import java.io.IOException;

public class DataInputOutputStream {

	public static void main(String[] args) throws IOException
	{
         File f=new File("Test/f3.txt");
         DataOutputStream dos=new DataOutputStream(new FileOutputStream(f));
         dos.writeInt(35);
         dos.writeInt(105);
         dos.close();
         
         DataInputStream dis=new DataInputStream(new FileInputStream(f));
         System.out.println(dis.readInt());
         System.out.println(dis.readInt());
         dis.close();
	}

}
