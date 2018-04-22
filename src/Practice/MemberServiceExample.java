package Practice;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("programmer", "jave");
		if (result) {
			System.out.println("You are logged in");
			memberService.logout("programmer");
		} else {
			System.out.println("Incorrect of id or password");
		}

	}

}
