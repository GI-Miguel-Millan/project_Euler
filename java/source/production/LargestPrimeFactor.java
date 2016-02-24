package production;
import java.util.*;

public class LargestPrimeFactor {
	private long largeNum;
	
	public LargestPrimeFactor(){
		this.largeNum = 0;
	}
	
	public LargestPrimeFactor(long num){
			this.largeNum = num;
	}
	
	public long getLargestPrime(){
		long tmp = 2;
		ArrayList<Long> primes = new ArrayList<Long>();
		primes.add((long)2);
		primes.add((long)3);
		primes.add((long)5);
		primes.add((long)7);
		primes.add((long)13);
		primes.add((long)17);
		primes.add((long)19);
		primes.add((long)23);
		if( this.largeNum < 10 && this.largeNum % 2 == 0){
			return tmp;
		}
		
		for(long i = 1; i <= this.largeNum; i +=2){
			
			for (long x: primes)
			{
				if(i%x == 0)
					i+=2;
				
			}
			
			//System.out.println( "i = " + i);
			if(this.largeNum % i == 0 && this.isPrime(i)){
				tmp = i;
				System.out.println("tmp = " + tmp);
			}
		}
		
		return tmp;
	}
	
	public boolean isPrime(long factor){
		if ( factor % 2 == 0)
			return false;
		
		for(long i = 3; i*i <= factor; i+=2)
		{
			if(factor % i ==0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args){
		LargestPrimeFactor LPF1 = new LargestPrimeFactor(10);
		LargestPrimeFactor LPF2 = new LargestPrimeFactor(13);
		LargestPrimeFactor LPF3 = new LargestPrimeFactor(25);
		LargestPrimeFactor LPF4 = new LargestPrimeFactor(600851475143l);
		
		System.out.println("LargestPrimeFactor(10) = " + LPF1.getLargestPrime());
		System.out.println("LargestPrimeFactor(13) = " + LPF2.getLargestPrime());
		System.out.println("LargestPrimeFactor(25) = " + LPF3.getLargestPrime());
		System.out.println("LargestPrimeFactor(600851475143) = " + LPF4.getLargestPrime());
	}
}