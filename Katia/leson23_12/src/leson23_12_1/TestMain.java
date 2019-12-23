package leson23_12_1;

import java.util.Random;

public class TestMain {
	
	public static void main(String[] args) {
		
		int nums[] = new int[7];
		Random random= new Random();
		int nums2[] = new int[7];
	try {
			for (int i=0; i<8; i++) {
				
				nums[i] = random.nextInt(10);
				System.out.println(nums[i]);
			}
	} catch (ArrayIndexOutOfBoundsException b) {
		b.fillInStackTrace();
		
	}
			
			System.out.println("-------------");
			try {
			for (int i=0; i<nums2.length; i++) {
				
				nums2[i] =nums[i]/ random.nextInt(5);
				System.out.println(nums2[i]);
				
			}
			
			} catch (NullPointerException | ArithmeticException e) {
				e.printStackTrace();
			}
			
	}

}
