import java.util.*;
public class maxOcur {

	public static void main(String[] args) {
		int n,count=1,max=0,p=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] arr=new int[n];
		int[] fre=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
			fre[i]=-1;
		}
		for(int i=0;i<n;i++){
			count=1;
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
					fre[j]=0;
				}
			}
		
			if(fre[i]!=0){
				fre[i]=count;
			}}
		for( int i=0;i<n;i++){
				max=fre[0];
				if(max<fre[i]){
					max=fre[i];
					p=i;
				}
			
			}
	
		for(int i=0;i<n;i++){
			if(fre[p]==fre[i]){
				System.out.println(arr[i]+" "+fre[i]);
			}
		}
			
		}
		
	}

