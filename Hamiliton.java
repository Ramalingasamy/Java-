import java.util.*;
public class Hamiliton {

	public static void main(String[] args) {
		
		Scanner  s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			int flag=0;
			for(int j=i+1;j<n;j++){
				if(arr[i]<arr[j]){
					flag=1;
					break;
				}
				else{
					flag=0;
					
				}
			}
		
		
		if(flag==0){
		
				System.out.println(arr[i]);
			
		}
		}
	}

}
