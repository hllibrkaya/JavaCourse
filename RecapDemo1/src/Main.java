
public class Main {

	public static void main(String[] args) {
		int num1=10, num2=20, num3=15, biggest;
		biggest=num3;
		
		if(num1>biggest) {
			biggest=num1;
		}
		
		if(num2>biggest) {
			biggest=num2;
		}
		
		System.out.println("Biggest number is: " + biggest);
	}

}
