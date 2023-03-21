package Vishakha;

import SeleniumPracticePackage.TestArrayy;

public class VishakhaTest {

	public static void main(String[] args) {
		VishakhaTest vishakha= new VishakhaTest();  // object creation
		
		System.out.println("Output of this method is: "+vishakha.vishakhamethod());
	}
	
	public int vishakhamethod() {
		int a=10;
		int b=20;
		int c= (a+b);
		return c;
	}
}

