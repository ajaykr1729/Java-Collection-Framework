
public class BasicQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));
		

	}
	
	
	//prime number
	static boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				{
				return false;
				}
			
		}
		return true;
	}

	//fibonacci series
	static void fibo(int n) {
		//0 1 1 2 3 5 8.........
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		 for(int i=0;i<n-2;i++)
		 { c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;
			
		 }
		
	}


 static int fact(int n) {
	 if (n==1 || n==0)
		 return 1;
	 else
		 return n*fact(n-1); //4*fact(3)-> 4*3*fact(2)->12*2*fact(1)->24*1->24
	  

	 
 }
}
