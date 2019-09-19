/* Grading Notes
25/25 points
Good job!
It's probably not necessary to separate the pieces of the letters into different methods, I didn't deduct points for this. 
-Sarah Gilliam
*/
public class Mississippi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterM();
		iss();
		iss();
		letterI();
		letterP();
		letterP();
		letterI();
	}
	public static void iss() {
		letterI();
		letterS();
		letterS();
	}
	public static void letterM() {
		letterMWide();
		System.out.println("MM   MM");
		System.out.println("M M M M");
		System.out.println("M  M  M");
		letterMWide();
		letterMWide();
		letterMWide();
		System.out.println();
	}
		
	public static void letterI() {
		letterIEnds();
		System.out.println("  I  ");
		System.out.println("  I  ");
		System.out.println("  I  ");
		System.out.println("  I  ");
		System.out.println("  I  ");
		letterIEnds();
		System.out.println();
	}
	public static void letterS() {
		System.out.println(" SSSSS ");
		System.out.println("S     S");
		System.out.println("S      ");
		System.out.println(" SSSSS ");
		System.out.println("      S");
		System.out.println("S     S");
		System.out.println(" SSSSS ");
		System.out.println();
	}
	public static void letterP() {
		System.out.println("PPPPPP ");
		System.out.println("P     P");
		System.out.println("P     P");
		System.out.println("PPPPPP ");
		System.out.println("P");
		System.out.println("P");
		System.out.println("P");
		System.out.println();
	}
	public static void letterMWide() {
		System.out.println("M     M");
	}
	public static void letterIEnds() {
		System.out.println("IIIII");
	}

}
