import java.util.*;
public class Adjacent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		char[] c=n.toCharArray();
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
			if(i+1!=c.length)
			{
			if(c[i]==c[i+1])
			{
			System.out.print("*");
			}
			}
			
		}

	}

}
