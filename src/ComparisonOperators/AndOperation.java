package ComparisonOperators;

public class AndOperation {

	public static void main(String[] args) {
		String userName = "rrr@gmail.com";
		String enteredUserName = "rrr@gmail.com";
		
		String password = "12345qwe";
		String enteredPassword = "12344wqe";
		
		boolean areEqualUserName = userName.equals(enteredUserName);
		System.out.println("Usename correct=" + areEqualUserName);
		
		boolean areEqualPassword = password.equals(enteredPassword);
		System.out.println("Password Correct=" + areEqualPassword);
		
		boolean areBothEqual= areEqualUserName && areEqualPassword;
		System.out.println("Username and Password correct="+areBothEqual);

	}

}
