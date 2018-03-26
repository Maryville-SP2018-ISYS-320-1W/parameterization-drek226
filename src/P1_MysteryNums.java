/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 1. Your output prediction:
  15,42
  10,25
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 // I was right but I just guessed "num1" and "num2" would print the answer of each sentence. 
 
 
 */

public class P1_MysteryNums {
	public static void main(String[] args) {
        int x = 15;
        sentence( x, 42 );
        
        int y = x - 5;
        sentence( y, x + y);
    }
    
    public static void sentence( int num1, int num2 ) {
        System.out.println( num1 + " " + num2 );
    }


}
