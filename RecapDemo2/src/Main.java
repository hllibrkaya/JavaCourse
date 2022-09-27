
public class Main {

	public static void main(String[] args) {
		double[] myList= {3.9, 2.5, 6.84, 7.44};
		double sum=0, max=0, min=myList[0];
		for (double num : myList) {
			sum= sum + num;
			
			if(max<num) {
				max=num;
			}
			
			if(num<min) {
				min=num;
			}
			
			System.out.println(num);
		}

		System.out.println("Total: " + sum + " Max; " + max + " Min: " + min);
	}

}
