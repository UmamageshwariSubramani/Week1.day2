package weekone.day2;

public class Calculator {
	
	public int add(int num1,int num2) {
		return (num1+num2);
		
		
	}
	public double sub (double num1,double num2) {
		return (num1-num2);
		
	}
	
	public int multiple (int num1,int num2) {
		return (num1*num2);
	}
	
	public int divide(int num1,int num2) {
		return (num1/num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator cr = new Calculator();
     System.out.println(cr.add(3, 8));
     System.out.println(cr.sub(9.9, 11.6));
     System.out.println(cr.multiple(96, 45));
     System.out.println(cr.divide(960, 85));
	}

}
