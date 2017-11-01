package programexamples;

public class ifElse {

public static void main(String[] args) {
System.out.println(checkifSleepIn(true,false));
}
    
	static boolean checkifSleepIn ( boolean weekday, boolean vacation) { 

	if(! weekday || vacation ) 
	{
	 return true;}
else
	return false;
}}