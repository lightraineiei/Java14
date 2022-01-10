import java.util.Scanner;
import java.lang.String;  
public class hw02 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		String str;
		System.out.println("輸入字串:");
		str = scn.nextLine();
		System.out.println("轉換成大寫: "+str.toUpperCase());
	}

}
