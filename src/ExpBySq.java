//Recursive implementation of exponentiation by squaring
import java.util.*; 



class ExpBySq{ //Declare class
	public static void main(String[] args) //Declare main function
	{ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base value: "); //Receive and assign a base value for which to calculate its exponentiation
		int base = scanner.nextInt(); 
		
		System.out.println("Enter a exponent value: "); //Receive and assign the exponent value
		int exp = scanner.nextInt();
		scanner.close(); //Close scanner

		int resultantValue = exp(base, exp); //Initiate the first call of the recursive function
		System.out.println(resultantValue); //Output final resultant value (i.e. the value of the exponentiation) to console
	} //End main function

	static int exp(int base, int exp){ //Declare recursive function exp
		if (exp < 0) //if exponent is negative, inverting exponent and convert base x to decimal
			return exp( 1/base, -exp );
		
		if (exp == 0) //base-case: if exponent is 0, return 1
			return 1; 

		if (exp == 1) //base-case: if exponent is 1, return x
			return base; 

		if (exp % 2 == 0) //if exponent is multiple of 2, recursively call function squaring the current value of x and halving exponent value
			return exp( base*base, exp/2 );

		else //if exponent is NOT a multiple of 2, recursively call function cubing the current value of x and halving exponent value, i.e. x^3/x*x*x
			return base * exp( base*base, exp/2 );
	} //End recursive function exp
}//End class
