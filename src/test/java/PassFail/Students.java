package PassFail;
import java.util.Scanner;

public class Students {
	public static void main(String[] args)
	{
		int m1, m2, m3;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter your Physics marks");
		m1= sc.nextInt();
		
		
		System.out.println("Enter your Chemistry marks");
		m2= sc.nextInt();
		
		
		System.out.println("Enter your Maths marks");
		m3= sc.nextInt();
		
		float avg= (m1+m2+m3)/3.0f;
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			
			System.out.println("congrats.. You are promoted");
			
		}
				
		else {
			System.out.println("You are not promoted");
			
		}
		
	}
}
