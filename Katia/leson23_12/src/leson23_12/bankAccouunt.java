package leson23_12;

public class bankAccouunt {
	private double balance;

	public bankAccouunt(double balance) {
		System.out.println("Thanks for creating account in our bank!!!");
				this.balance = balance;
		System.out.println("Now your balance is "+balance);
	}
	public void makeDepozit(double amount) {
		balance+=amount;
		System.out.println("You added is "+amount+"$ to balace!!");
		
	}
	public void withdrawMoney (double amount) throws NoManyExcept {
		try {
		if (amount<balance) {
			balance-=amount;
			System.out.println("You withdraw "+amount+ "$ for balance and now your balance " +balance+ "$");
			
			
		} else {
			String massage=("Your amount is under money!! Your balace is "+ balance);
		throw new NoManyExcept(massage);
//		throw new IllegalArgumentException()
		}
		
	} catch (NoManyExcept e) {
		System.out.println(e.getMessage());
	}
	catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
		
	}
}
}

