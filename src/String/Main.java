package String;
import java.util.*;

public class Main { 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int num=sc.nextInt();
		char [] c=str.toCharArray();
		RoteString.roteString(c, num);
		for(int i=0;i<c.length;i++){
		System.out.print(c[i]);
		}
	}
	
}
