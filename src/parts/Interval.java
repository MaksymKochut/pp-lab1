package parts;

/** This is the class of interval */
public class Interval {
	private int start;
	private int end;

	public Interval(){
		start = 0;
		end = 1;
	}

	/** Create an interval
	* @param s start of the interval
	* @param e end of the interval
	*/
	public Interval(int s, int e){
		if (s >= e){
			start = 0;
			end = 1;
			return;
		}

		start = s;
		end = e;
	}

	/** Get start of interval
	* @return start of interval */
	public int start(){ return start; }

	/** Get end of interval
	* @return end of interval */
	public int end(){ return end; }
}
