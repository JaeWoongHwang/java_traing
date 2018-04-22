package Practice;

public class MemberService {
	// Set field
	public String id;
	public String password;

/*	// Set Constructor
	public MemberService(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}*/

	// Set Method
	boolean login(String id, String password) {
		this.id = "programmer";
		this.password = "java";
		return true;
	}

	void logout(String id) {
		this.id = "programmer";
		System.out.println("You have been logged out");
	}
}
