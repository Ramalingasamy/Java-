import java.util.*;
public class Substr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int t=0;t<test;t++)
		{
			String str=s.next();
			int n=s.nextInt();
			int m=s.nextInt();
			String sub=str.substring(n,m+1);
			char[] ch=sub.toCharArray();
			Arrays.sort(ch);
			String out="";
			for(int i=ch.length-1;i>=0;i--)
			{
				out+=ch[i];
			}
			String output=str.replace(sub, out);
			System.out.println(output);
		}

	}

}
