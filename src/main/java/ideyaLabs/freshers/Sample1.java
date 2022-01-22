package ideyaLabs.freshers;

public class Sample1 {
	private double add() {
		double a=1.0;
		double b=2.0;
		double c=3.0;
		double result=a+b+c;
		return result;
	}
	public static void main(String[] args) {
		Sample1 d = new Sample1();
		double y = d.add();
		System.out.println(y);
		
	}
}
