package production;
import java.util.*;

public class NthPrime {
	
	
	public int getNthPrime(int nthPrime){
		int primeCounter = 1; //We skip 2, and take it into account pre-loop.
		int currentNumber = 1; //We increment before checking for primes.
							   //Therefore, the first number tested is 3.
		
		if(nthPrime == 1)
			return 2;
		
		while(primeCounter < nthPrime){
			currentNumber +=2;
			if(this.isPrime(currentNumber)){
				//System.out.println("current Number: " + currentNumber);
				primeCounter++;
				//System.out.println("prime Counter: " + primeCounter);
			}
		}
		
		return currentNumber;
		
	}
	
	public boolean isPrime(int factor){
		if ( factor % 2 == 0)
			return false;
		
		for(int i = 3; i*i <= factor; i+=2)
		{
			if(factor % i ==0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		NthPrime nthP = new NthPrime();
		
		System.out.println("The 10001st prime number is " + nthP.getNthPrime(10001));
	}
	
}