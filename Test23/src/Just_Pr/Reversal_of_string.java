package Just_Pr;

public class Reversal_of_string {

	public static void main(String[] args) {
		String str="SNEHAL";
		
	String rev=" ";
	
	//int size_of_array=str.length();
	for (int i =str.length()-1; i>=0; i--) {
		
		rev=rev+str.charAt(i);
	}
	
	
	System.out.println("Reversal of  string"+rev);
	

	
	}
}
