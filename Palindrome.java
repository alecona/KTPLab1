import java.util.Scanner;
public class Palindrome {

 	public static void main(String[] args) {
 		Scanner in = new Scanner(System.in);
 		for (int i = 0; i < args.length; i++) {
 			String s = args[i];
 			
		} 	
		for (int i = 0; i < args.length; i++) {

 			if(isPalindrome(args[i])) System.out.println(args[i] + " is Palindrome");
 			else System.out.println(args[i] + " is not Palindrome");
 			
		} 

	}
	/** Инвертирование строки **/
	public static String reverseString(String s){
		String ss = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			ss += s.charAt(i);
		}
		return ss;
	}
	/** Проверка строк на идентичность **/
	public static boolean isPalindrome(String s){
		if(s.equals(reverseString(s))) return true;
		else return false;
	}
}