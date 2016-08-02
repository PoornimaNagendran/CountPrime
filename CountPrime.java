import java.util.Scanner;
public class CountPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
int count=0;
int check=0;
int d;
System.out.println("Enter a range");
int n=s.nextInt();
System.out.println("Enter a numbers");
for(int i=0;i<n;i++)
{
	d=s.nextInt();
	if(d==0 || d==1)
	{
		count=1;
	}
	for(int j=2;j<d;j++)
	{
		if(d%j==0)
		{
			count=1;
		}
	}
	if(count==0)
	{
		check++;
		}count=0;
			
}
System.out.println("Number of Prime numbers is");
	System.out.println(check);
	}

}
