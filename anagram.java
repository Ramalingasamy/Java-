import java.util.Scanner;


public class anagram {
	public static void main(String[] args) {
		int flag = 0,count=0,l,l1,f=0,i,j,len;
		char temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the First Name:");
		String name1=s.next();
		System.out.println("\nEnter the second Name:");
		String name2=s.next();
		l=name1.length();
		l1=name2.length();
		if(l==l1){
			 len=l;
			for( i=0;i<len;i++){
				flag=0;
				for( j=0;j<len;j++){
					if(name1.charAt(i)==name2.charAt(j)){
						flag=1;
						break;
					}
				}
				if(flag==0){
					f=1;
					break;
					
				}
			}
			if(f==1){
				System.out.println("not Anagram");
			}
			else{
				System.out.println("Anagram");
			}
		}else{
			System.out.println("Must have same length");
		}

	}

}
