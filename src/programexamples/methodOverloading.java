package programexamples;

public class methodOverloading {


public int sum(int num1, int num2) {
	return num1+num2;
}

//valid overloaded method same name but different 
//"types" and number of parameters this type is a double
public double sum(double num1, double num2) {
	return num1+num2;
}

//valid overloaded method same name but different number of parameters. 3 instead of 2
public int sum(int num1, int num2, int num3) {
	return num1 + num3 + num2;
}}