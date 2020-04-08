public class FizzBuzz {
	public static int test(int x) {
		int rem = x % 15;
		if(rem == 0) return 3; 
		rem = x % 3;
		if(rem == 0) return 1; 
		rem = x % 5;
		if(rem == 0) return 2; 
		return 0;              
	}
	public static void main(String[] args) {
		for(int x = 1; x <= 100; x++) {
			switch(test(x)) {
			case 3:
				System.out.println("FizzBuzz"); break;
			case 1:
				System.out.println("Fizz"); break;
			case 2:
				System.out.println("Buzz"); break;
			default:
	            System.out.println(x); break;
			}
		}
		
	}
}
