package project_Euler.test;
import 

public class testEvenFib extends TestCase{
	EvenFib eFib;
	
	public void setup(){
		eFib = new EvenFib();
	}
	
	public void test(){
		assertEquals(eFib.getFibonacci(6), eFib.getFibonacci(5) + eFib.getFibonacci(4));
		assertEquals(44, eFib.getEvenFibSum(10));
	}
}