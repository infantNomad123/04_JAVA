package edu.kh.poly.pack3.model.dto;


//각자 구현한 계산기
public class JkhCalculator implements Calculator, Machine {

	@Override
	public int plus(int a, int b) {
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		return a - b;
	}

	@Override
	public int multi(int a, int b) {
		return a * b;
	}

	@Override
	public double div(int a, int b) {
//		if( b == 0) return 0.0;
//		return (double)a/b;
		
		return b == 0 ? 0.0 : (double)a/b;
	}

	@Override
	public int mod(int a, int b) {
		// TODO Auto-generated method stub
		return a % b;
	}

	/**
	 *
	 */
	@Override
	public int sum(int... numbers) {
		//가변인자(...) : 전달 인자의 개수 (전달 되는 값의 개수)
//															가 변할 수 있는 매개 변수  (전달 인자)
		// -> printf() 가 가변인자 사용의 가장 댜표적인 예시
		// numbers 는 int[] 타입
		
		int sum =0; 
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}

	@Override
	public double areaOfCircle(double r) {
		// TODO Auto-generated method stub
		return Calculator.PI*r*r;
	}

	@Override
	public boolean rangeCheck(int num) {
		// TODO Auto-generated method stub
		return num >= Calculator.MIN_NUM && num <=  Calculator.MAX_NUM;
	}

	@Override
	public int pow(int a, int x) {
		// TODO Auto-generated method stub
//		int product = 1;
//		for(int i =0; i <= x; i++) product *= a ;
//		return product;
		return (int)Math.pow(a,x);
	}

	@Override
	public String toBinary(int num) {
		// TODO Auto-generated method stub
		return Integer.toBinaryString(num);
	}

	@Override
	public String toHexadecimal(int num) {
		// TODO Auto-generated method stub
		return Integer.toHexString(num);
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Good bye");
	}
	

}
