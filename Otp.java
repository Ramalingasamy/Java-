import java.util.*;
public class Otp {

	public static void main(String[] args) {
		
		int length=6;
		try {
			System.out.println(OTP(length));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
	static char[] OTP(int length) throws InterruptedException
	{
		System.out.println("Generating OTP.......");
		System.out.println("Your OTP is ");
		Thread.sleep(2000);
		String str="1234567890";
		Random rnd=new Random();
		char[] otp=new char[length];
		for(int i=0;i<length;i++)
		{
			otp[i]=str.charAt(rnd.nextInt(str.length()));
		}
		return otp;
		
	}

}
