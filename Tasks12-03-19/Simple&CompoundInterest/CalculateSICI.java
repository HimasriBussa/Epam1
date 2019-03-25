package SI_CI;

public class CalculateSICI {
	public double simpleInterest(double principal,double time ,double rate) {
		return (principal * rate * time)/100;
	}
	
	public double compoundInterest(double principal,double time ,double rate) {
		return (principal * (Math.pow((1+rate/100), time))-principal);	
	}
}
