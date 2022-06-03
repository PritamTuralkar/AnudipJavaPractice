package LogicalOperators;
import java.util.*;

public class LogicalOperators{
	
	public static void main(String[] args) {
		
		String x = "Pritam";
		String y = "Pritam123";
			
	Scanner sc = new Scanner(System.in);
			
	System.out.println("Enter User name: ");
	String user = sc.nextLine();
	System.out.println("Enter password: ");
	String pass = sc.nextLine();
			
	if ((user.equals(x) && pass.equals(y) ) || (pass.equals(x) && user.equals(y) )) {
				
	System.out.println("WELCOME" + x);
				
	}else {
				
	System.out.println("Invalid username and password");
			}
				
	}
}

