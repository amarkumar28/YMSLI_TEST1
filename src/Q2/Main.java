package Q2;

public class Main {
	public static void main(String[] args) {
		Date date=new Date(12,11,1998);
		Owner owner=new Owner("Amar","ABC123",date);
		Account account=new Account(owner,1500.0f,"123456"); 
		
		System.out.println(account);
		account.deposit(1500);
		System.out.println(account);
		account.withdraw(1300);
		System.out.println(account);
		
		Account savingAccount=new SavingAccount(owner,1500.0f,"123456",5);
		System.out.println(savingAccount);
		savingAccount.deposit(1500);
		System.out.println(savingAccount);
		
		Account currentAccount=new CurrentAccount(owner,1500.0f,"123456",1000);
		System.out.println(currentAccount);
		savingAccount.deposit(1800);
		System.out.println(currentAccount);
		
	}
}
