package production;

public class EvenFib {
	
	public int getFibonacci(int index){
		if (index == 0 || index == 1){
			return 1;
		}else{
			return this.getFibonacci(index - 1) + this.getFibonacci(index - 2);
		}
	}
	
	public int getEvenFibSum(int upIndex){
		int sum = 0;
		int tmpFib;
		
		if (upIndex <= 1){
			return sum;
		}else{
			for (int i = 2; i <= upIndex; i++){
				tmpFib = this.getFibonacci(i);
				if (tmpFib % 2 == 0){
					System.out.println("Sum = " + sum);
					sum += tmpFib;
					System.out.println("Sum += " + tmpFib);
				}
			}
			System.out.println("Sum = " + sum);
			return sum;
		}
	}
	
	public static void main(String[] args)
	{
		EvenFib eFib = new EvenFib();
		
		int i = 0;
		while (eFib.getFibonacci(i) < 4000000){
			//System.out.println(eFib.getFibonacci(i));
			i++;
		}
		if (eFib.getFibonacci(i) > 4000000)
			i--;
		
		//System.out.println(eFib.getFibonacci(i));
		System.out.println("Sum of even fibonacci numbers less than or equal to"
							+ " four million: " + eFib.getEvenFibSum(i));
	}
}