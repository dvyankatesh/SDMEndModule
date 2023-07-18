import java.util.Scanner;

class ReverseString {
	
	public static void main (String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter a String you want to reverse");

		String OriginalString = sc.next();
		

	    String ReverseString="";
		char ch;
	
		System.out.print("Original String: ");
		System.out.println(OriginalString); 
	
		for (int i=0; i<OriginalString.length(); i++)
		{
			ch= OriginalString.charAt(i); 
			ReverseString= ch+ReverseString; 
		}
		System.out.println("Reversed String: "+ ReverseString);
	}
}


