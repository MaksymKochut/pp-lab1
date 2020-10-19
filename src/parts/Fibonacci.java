package parts;

/** This is the class of fibonacci sequence */
public class Fibonacci {
	private int number_1 = 0;
	private int number_2 = 1;

	/** Set first and second number of sequence
	* @param n1 first number of sequence
	* @param n2 second number of sequence
	*/
	public void set_numbers(int n1, int n2){
		number_1 = n1;
		number_2 = n2;
	}

	/** Get current numbers of sequence
	* @return List of two numbers {first number, second number}
	*/
	public int[] get_numbers(){
		int[] res = {number_1, number_2};
		return res;
	}

	/** Make one iteration of the sequence
	* @return List of two numbers AFTER iteration {first number, second number}
	*/
	public int[] iterate(){
		int temp = number_2;
		number_2 += number_1;
		number_1 = temp;

		return get_numbers();
	}

}
