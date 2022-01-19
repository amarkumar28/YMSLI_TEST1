package Q2;

public class Account {
	private Owner owner;
	private float balance;
	private String number;
	
	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Account() {
	}

	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}

	public Account(Account account) {
		this.balance = account.balance;
		this.number = account.number;
		Date dob = new Date(account.owner.getDateOfBirth().getDate(), account.owner.getDateOfBirth().getMonth(),
				account.owner.getDateOfBirth().getYear());
		this.owner = new Owner(account.owner.getName(), account.owner.getNic(), dob);
	}

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}

	public void print() {
		this.toString();
	}

	public float getBalance() {
		return balance;
	}

	public void deposit(float amount) {
		this.setBalance(this.getBalance()+amount);
	}

	public void withdraw(float amount) {
		if(this.getBalance()-amount > 0) {
			this.setBalance(this.getBalance()-amount);
		}else {
			System.out.println("You can not withdraw ammount because you are exceeding your ammount");
		}
	}
}
