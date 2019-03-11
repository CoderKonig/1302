import java.util.*;
public class classinteractive {

	public static void main(String[] args) {
		
	// initialize password -->
		
		String password = "abracadabra";
		Scanner console = new Scanner(System.in); 
		String pw = "";

	do {	
		System.out.println("What is your password?");
		pw = console.next();
	
	}	while (!pw.equals(password));
	
	// pw. equals checks the password ALREady initialized ^
	
	
	System.out.println(" Password accepted.");
	
	
}
}



//getPassword()