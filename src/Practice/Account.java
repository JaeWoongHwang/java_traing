package Practice;

public class Account {
	// Set field
	private String anum;
	private String owner;
	private int balance;

	// Constructor
	public Account(String anum, String owner, int balance) {
		this.anum = anum;
		this.owner = owner;
		this.balance = balance;
	}

	// Set getter setter
	public String getAnum() {
		return anum;
	}

	public void setAnum(String anum) {
		this.anum = anum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
