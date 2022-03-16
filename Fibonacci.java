
public class Fibonacci {
    
    // Fibonacci recursive solution

  public static int fibonaccirecursive(int n) {
		if(n<=1){
			return n;
		}
		return fibonaccirecursive(n-1)+fibonaccirecursive(n-2);
	}
	
	public static void fibonacciAssistant(int n){
		
		for(int i = 0;i < n;++ i)
		{
			System.out.print(" "+fibonaccirecursive(i));
			
		}
	}
	
	
	static int arr[] = new int[100];
	public static void fibonacciCache(int n) {
		int j=0;
                arr[0]=0;
		arr[1]=1;
		for(j=0; j<n; j++)
		{
			System.out.print(arr[j] + " ");
		}
		
		try{
			arr[n] = arr[j-1] + arr[j-2];
			System.out.println();
		}catch(IndexOutOfBoundsException e){
			
		}
	}
	
         // Fibonacci Iterative solution

	public static void fibonacciIterative(int n)
	{
		int prev = -1;
		int next = 1;
		int sum;
		int i;
		
		for(i = 0;i < n;++ i)
		{
			sum = next + prev;
			prev = next;
			next = sum;
			arr[i] = next;
			System.out.print(next + " ");
			if(i == n-1){
				System.out.println();
			}
		}
	}

	
	public static void main(String[] args) {
		
		int limit = 20;
		long starttime0 = System.nanoTime();
		for(int i = 0;i <= limit;++ i)
		{
			fibonacciAssistant(i);
			System.out.println();
		}
		long estimatedTime0 = System.nanoTime() - starttime0;
                         System.out.println();
		System.out.println("The estimated time in nanoseconds is: "+ estimatedTime0);
                System.out.println();
                System.out.println("-------------------------------------------------------------------");
                System.out.println();
		
		
		long starttime1 = System.nanoTime();
		for(int i = 0;i <= limit;++ i)
		{
			fibonacciIterative(i);
		}
		long estimatedTime1 = System.nanoTime() - starttime1;
                         System.out.println();
		System.out.println("The estimated time in nanoseconds is:"+ estimatedTime1);
                System.out.println();
                System.out.println("-------------------------------------------------------------------");
                System.out.println();
		
		long starttime2 = System.nanoTime();
		for(int i = 0;i <= limit;++ i)
		{
			fibonacciCache(i);
                        
		}
		long estimatedTime2 = System.nanoTime() - starttime2;
                         System.out.println();
		System.out.println("The estimated time in nanoseconds is: "+ estimatedTime2);
                System.out.println();
	}

}
