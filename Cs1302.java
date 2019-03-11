import java.util.*;
public class Cs1302 {
	public static void getPassword(){
		
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

