package leson23_12;

public class NoManyExcept  extends Exception {
	private String amount;

	public NoManyExcept(String amount) {
		super();
		this.amount = amount;
	}

	public String getAmount() {
		return amount;
	}
	
	

} 
