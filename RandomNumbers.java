import java.math.*;
import java.util.*;
public class RandomNumbers{
	public static void main(String[] args){
		
		//Accepting the Values from the User.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers in range");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter the Number of Random Values: ");
		int nums = sc.nextInt();
		//Accepting the Values from the User.
		
		if(Math.abs(num1-num2)<=nums)
			System.out.println("Range Exception: Expected Greater Scope of Range");
		else{
			Set<Long> set = new HashSet<Long>();
			while(set.size()!=nums){
				String str = String.valueOf(System.nanoTime()-System.currentTimeMillis());
				long rand =(long) Long.valueOf(str.substring(2,str.length()));
				double randomMult = (rand/0.111111314)%(22.0/7);
				randomMult = randomMult/3.14567;
				set.add(Math.round(randomMult*(num1-num2)+num2));
			}
			System.out.println(set.toString());
			//System.out.println(System.nanoTime()-System.currentTimeMillis());
		}
	}
}	

// Seed: 21915691993963