# This is the third version of FizzBuzz,
# making sure the code is readable/understandable/clean.

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int flag = 0;
			flag += (i%3==0)? 1:0; //For multiples of three, flag=Flag+1;
			flag += (i%5==0)? 2:0; //For multiples of five, flag=flag+2;
			switch(flag) {
			case 1:
				System.out.println("Fizz"); break;//For multiples of three, print "Fizz";
			case 2:
				System.out.println("Buzz"); break;//For multiples of Five, print "Buzz";
			case 3:
				System.out.println("FizzBuzz"); break;//For multiples of both three and five, print "FizzBuzz";
			case 0:
				System.out.println(i); break;// Else print the number.
			}
		}
		
	}
}
