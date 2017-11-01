package programexamples;

public class stringchar {

public static void main(String args[]) {


System.out.println(firstTwo("Jasmine"));}

static String firstTwo(String Jasmine) {
		if (Jasmine.length() < 2) {
			return Jasmine;
		} else {
			return Jasmine.substring(0, 2);
		}
	}

}