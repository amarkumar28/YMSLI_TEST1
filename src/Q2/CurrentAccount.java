package Q2;

public class CurrentAccount extends Account {
	private float minBalance;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(CurrentAccount account) {
		super(account);
		this.minBalance = account.minBalance;
	}

	public CurrentAccount(Owner owner, float balance, String number, float minBal) {
		super(owner, balance, number);
		this.minBalance = minBal;
	}

	@Override
	public String toString() {
		return "CurrentAccount [minBalance=" + minBalance + ", toString()=" + super.toString() + "]";
	}

	public float getCharges() {
		return minBalance;
	}
}
