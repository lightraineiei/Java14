import java.io.*;
public class hw04 
{
	public static void mani(String args[]) throws IOException
	{
		char data[] = new char[128];
		FileReader fr = new FileReader("C:\\Users\\eiei\\Desktop\\1\\donkey");
		
		
		int num = fr.read(data);
		String str =new String(data,0,num);
		System.out.println("Characters read= "+num);
		System.out.println(str);
		
		fr.close();
	}
}
