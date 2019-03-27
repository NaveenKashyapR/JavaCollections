package com.naveen.practise;

public class Armstrong {
	
	public static int noOfDigits(Integer num)
	{
		int power=0;
		while(num!=0)
		{
			power++;
			num=num/10;
		}
		return power;
	}
	
	public static Integer power(int num,int power)
	{
		if(power==0)
		{
			return 1;
		}
		else if (power%2==0) {
			
		
	        System.out.println(power(num, power/2));
			return power(num, power/2)*power(num,power/2);
		}
		
		return num*power(num, power/2)*power(num,power/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="abc";
		String b=new String("def");
		String c=new String("def");
		System.out.println(a.concat(b));
		b.concat("fsgh");
		System.out.println(a);
		a=a+b+c;
		System.out.println(a);
		
		
		int n=251;
		int temp = 0;
		int p=noOfDigits(n);
		int sum=0;
		System.out.println(p);
		while(n!=0)
		{
			temp=n%10;
			System.out.println(temp);
			System.out.println(power(temp, p));
			sum=sum+power(temp, p);
			n=n/10;
			
			
		}
		System.out.println(sum);
		

	}

}
