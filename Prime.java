import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String prime=" ";
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=n;j++){
				if(i%j==0)
				{
					count++;
				}
			}if(count==2)
			{
				prime=prime+i+" ";
			}
		}
		System.out.println(prime);

	}

}
