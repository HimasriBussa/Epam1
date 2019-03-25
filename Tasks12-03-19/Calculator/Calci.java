
public class Calci {
	public int Addition(int num1, int num2) {
		return num1+num2;
	}
	
	public int Multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	public double Division(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return num1/(double)num2;
	}
}
