/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 4. Your output prediction: touch your head to your eye
  
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
 
 Wow! I was way off on this one. Why are so many lines printed? I do not understand this assignment
 
 
 */

public class P4_MysteryTouch {
    public static void main(String[] args) {
        String head = "shoulders";
        String knees = "toes"; 
        String elbow = "head";
        String eye = "eyes and ears";
        String ear = "eye"; 
        
        touch(ear, elbow);
        touch(elbow, ear); 
        touch(head, "elbow"); 
        touch(eye, eye);
        touch(knees, "Toes"); 
        touch(head, "knees " + knees );
    }
    
    public static void touch(String elbow, String ear) { 
        System.out.println( "touch your " + elbow + " to your " + ear );
    }



}
