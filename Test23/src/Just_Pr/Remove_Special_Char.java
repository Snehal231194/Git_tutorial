package Just_Pr;

public class Remove_Special_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="%^*GHJJJ&*";
		
	String strplain=str.replaceAll("[a-zA-Z0-9]","");
	System.out.println(strplain);
	}

}
