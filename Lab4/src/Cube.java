import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum = sumOfCube(n);
		System.out.println("Sum is "+sum);
	
		

	}
	
	public static int sumOfCube(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int c=(int) Math.pow(rem, 3);
		    sum=sum+c;
		    n=n/10;
		}
		return sum;
	}

}
