
public class Main {

	public static void main(String[] args) {
		String message= "I want to learn";
		System.out.println(message);
		System.out.println("Number of elements: " + message.length());
		System.out.println("3.element: "+ message.charAt(2));
		System.out.println(message.concat(" Java"));
		System.out.println(message.startsWith("I"));
		System.out.println(message.endsWith("a"));
		char[] characters= new char[7];
		message.getChars(0,6, characters,0);
		System.out.println(characters);
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("a"));
	}

}
