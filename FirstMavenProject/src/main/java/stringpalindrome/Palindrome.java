package stringpalindrome;

public class Palindrome {
	//method1
	// Pointers pointing to the beginning i
    // and the end of the string j
static boolean isPalindrome(String str) {
	int i=0,j=str.length()-1;
	//while is for there are characters to compare
	while(i<j) {
		//if there is a mismatch
		if(str.charAt(i)!=str.charAt(j)) 
			return false;
			i++;//increment first pointer
			j--;//decrement second pointer
		}
	
		return true;//string is palindrome
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="java";
String str2="MalAyAlaM";
//change the string to lowercase
//str1=str1.toLowerCase();
//str2=str2.toLowerCase();


System.out.println("string1:");
if(isPalindrome(str1))
	System.out.println("the given string is palindrome");
else
	System.out.println("the given string is not palindrome");

System.out.println();//for getting better readability

System.out.println("String2: ");
if(isPalindrome(str2))
	System.out.println("the given string is palindrome");
else
	System.out.println("the given string is not palindrome");
	}

}
