package production;

public class SmallestMultiple{
	
	public boolean isMultipleOfAll(int num){
		for (int i = 1; i<=20;i++){
			if(num % i != 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		i = 0;
		while(!this.isMultipleOfAll(i)){
			i++;
		}
		
		System.out.println("The smallest multiple of numbers 1-20 is: " + i);
	}
}