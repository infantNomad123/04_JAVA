package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.JkhCalculator;
import edu.kh.poly.pack3.model.dto.Machine;

public class CalculatorRun {
	public static void main(String[] args) {
		
		//인터페이스 장점:
		// 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에
//		 코드 유지보수 시
//		참조하는 객체만 변경하면 유지 보수가 완료된다 !!
		
		Calculator cal = new JkhCalculator();
		
		System.out.println(cal.plus(1, 2));
		System.out.println(cal.toBinary(30));
		System.out.println(cal.toHexadecimal(30));
		System.out.println(cal.rangeCheck(3));
		System.out.println(cal.pow(3, 3));
		System.out.println(cal.div(3, 2));
		System.out.println(cal.mod(3, 2));
		System.out.println("sum : " + cal.sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println("areaOfCircle : " + cal.areaOfCircle(2));
		System.out.println(cal.rangeCheck(500));
		System.out.println("areaOfCircle : " + cal.areaOfCircle(2));
		
		
		//참조 변수의 자료형을 Machine 으로  강제 형변환 해야지만
		//powerOn(), powerOff() 호출 가능
		((Machine)cal).powerOn();
		((Machine)cal).powerOff();
		
		
	}
}
