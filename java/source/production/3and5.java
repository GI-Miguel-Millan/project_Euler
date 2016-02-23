package project_Euler.production;

// Sums all multiples of 3 and 5 below a given upper bound
public class threeAndFive{
	private int highNum; //highest upper bound
	
	public threeAndFive(int high){
		highNum = high;
	}
	
	public threeAndFive(){
		highNum = 1000;
	}
	
	public int getSumOfMultiplesOfThreeOrFive(){
		int sum = 0;
		for( int i =0; i < highNum; i++)
		{
			if( i%3 == 0 || i%5 == 0 )
				sum +=i;
		}
		
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args){
		threeAndFive obj1 = new threeAndFive();
		
		System.out.println(obj1.getSumOfMultiplesOfThreeOrFive());
	}
}