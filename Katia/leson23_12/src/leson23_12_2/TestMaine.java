package leson23_12_2;

import java.lang.reflect.Array;
import java.util.Random;

public class TestMaine {

	public static void main(String[] args) {
		
		int[] nums2 = { 5,2,0,1,0,6,7 };
		int[] nums3 =new int[6];
		Random random= new Random();
		
		int suma=0;
		for (int i=0; i<nums2.length; i++) {
			suma+=nums2[i];
			
			
	
		}
		System.out.println(suma);
		
		try {
		int divade=0;
		for (int i=0; i<nums2.length; i++) {
		nums3[i] = suma /(nums2[random.nextInt(12)]);
		System.out.println(divade);
		}
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("Error"+e.getMessage());
			//e.printStackTrace();
		
	}		catch (ArrayIndexOutOfBoundsException b) {
			b.fillInStackTrace();
	}
		System.out.println(suma);
		
}
}
