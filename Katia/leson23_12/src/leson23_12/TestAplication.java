package leson23_12;

public class TestAplication {

	public static void main(String[] args) throws NoManyExcept {
	bankAccouunt ba= new bankAccouunt(10);
	ba.makeDepozit(1000);
//	try {
//	ba.withdrawMoney(800);
//	ba.withdrawMoney(420);
//	}
//	catch(NoManyExcept e) {
//		System.out.println(e.getMessage());
//		e.printStackTrace();
//			
//	}
//	ba.makeDepozit(800);
	ba.withdrawMoney(20);
	
	}
}
