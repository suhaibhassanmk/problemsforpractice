package hackerrankprograms;

import java.util.Scanner;

class check{
	public String app() {
	Scanner sc = new Scanner(System.in);
	char c = sc.next().charAt(0);
	if((c>=65 && c<=90) || (c>=97 && c<=122)) {
		return "Alphabet";
	}
	else if(c>=48 && c<=57) {
		return "Digit";
	}
	else {
		return "Special Character";
	}
	}
}
public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 check obj = new check();
		 String ab = obj.app();
		 System.out.println(ab);
		
		
	}

}

