package production;

public class LargestPalindrome{
		
	public boolean isPalindomic(int num){
		String s1 = Integer.toString(num);
		String s2 = "";
		for(int i =s1.length() -1; i>=0; i--)
		{
			s2 = s2 + s1.substring(i,i+1);
		}
		
		if(s1.equals(s2))
			return true;
		else
			return false;
	}
	
	public int getLargestPalindrome(){
		int tmpNum = 0;
		for(int j = 100; j<1000; j++){
			for(int k = 100; k<1000; k++){
				if(this.isPalindomic(j*k) && (j*k) > tmpNum)
					tmpNum = j*k;
				//System.out.println("j = " + j);
				//System.out.println("k = " + k);
				//System.out.println("tmpNum = " + tmpNum);
			}
		}
		return tmpNum;
	}
	
	public static void main(String[] args)
	{
		LargestPalindrome LP = new LargestPalindrome();
		
		System.out.println("The largest Palindrome from two 3-digit numbers is: "
							+ LP.getLargestPalindrome());
		
	}
}