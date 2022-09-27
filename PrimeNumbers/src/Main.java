
public class Main {

	public static void main(String[] args) {
		
		int num=25;
		boolean isPrime= true;
		
		if (num<=1) {
			return;
		}
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime=false;
			}
		}	
			
		if(isPrime && num==2) {
			System.out.println("It is a prime number");
			
		}
		else {
			System.out.println("It is not a prime number");
		}
			
			
		

	}

}
