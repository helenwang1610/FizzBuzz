# This is the second version of FizzBuzz
# with improving the efficiency of the program.

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int flag = 0;
			flag += (i%3==0)? 1:0; 
			flag += (i%5==0)? 2:0; 
			switch(flag) {
			case 1:
				System.out.println("Fizz"); break;
			case 2:
				System.out.println("Buzz"); break;
			case 3:
				System.out.println("FizzBuzz"); break;
			case 0:
				System.out.println(i); break;
			}
		}
		
	}
}
