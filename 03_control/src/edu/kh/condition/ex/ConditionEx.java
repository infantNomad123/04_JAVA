package edu.kh.condition.ex;
import java.util.Scanner;
/**
 * 조건문 기능용 클래스
 */
/**
 * 
 */
/**
 * 
 */
public class ConditionEx {
	
	// 필드 (객체의 속성 == 객체가 가지고 있는 값/변수)
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 *  나이를 입력 받아
	 *  19세 이상은 "성인", 미만은 "성인이 아닙니다"
	 */
	public void method1() {
//		int age = 10; // local variable
		
		System.out.println("나이를 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성인");
		}else {
			System.out.println("성인이 아닙니다");
		}
		
	}
	
	/**
	 * 나이를 입력 받아
	 * 13세 이하면 "어린이"
	 * 13세 초과 18세 이하 "청소년"
	 * 19세 이상 "성인"
	 */
	public void method2() {
		System.out.println("나이를 입력 : ");
		int age = sc.nextInt();
		String result;
		if(age <= 13) 												result = "어린이";
		else if (age > 13 && age <= 18) 			result = "청소년";
		else																	result = "성인";
		
		System.out.println(result);
	}
	
	/**
	 * 달(월)을 입력 받아 해당 계절 출력하기
	 * <ul>
	 * 	<li>봄   : 3,4,5</li>
	 * 	<li>여름 : 6,7,8</li>
	 * 	<li>가을 : 9,10,11</li>
	 * 	<li>겨울 : 12,1,2</li>
	 * 	<li>그 외 : 잘못 입력 </li>
	 * </ul>
	 */
	public void method3() {
		System.out.println("달을 입력 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		String result;
		if(month < 1 || month > 12)  result = "잘못 입력";
		else if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
	}
	
	public void method3a() {
		System.out.println("달을 입력 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		String result;
		if(month < 1 || month > 12)  result = "잘못 입력";
		else if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		
		System.out.println(result);
	}
	
	/**
	 * 잘못된 경우에 메서드를 중간에 종료
	 */
	public void method3b() {
		System.out.println("달을 입력 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("잘못 입력");
			return;  // 메서드를 종료하고 호출한 곳으로 돌아감
		}
		
		String result;
		if(month < 1 || month > 12)  result = "잘못 입력";
		else if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		
		System.out.println(result);
	}
	
	public void method3c() {
		System.out.println("달을 입력 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
	
		
		String result;
		switch(month) {
//		case 3: case 4: case 5: result = "봄"; break;
			case 3, 4, 5 : result = "봄"; break; //month가 3,4,5 인 경우
			case 6, 7, 8 : result = "여름"; break; //month가 3,4,5 인 경우
			case 9, 10, 11 : result = "가을"; break; //month가 3,4,5 인 경우
			case 12, 1, 2 : result = "겨울"; break; //month가 3,4,5 인 경우
			default: result = "잘못 입력"; break; //month가 3,4,5 인 경우
		}
		
		System.out.println(result);
	}
	
 /** P//F 판별하기
 * 
 * <pre>
 * 중간고사, 기말고사, 과제 점수를 입력 받아
 * 총점 60점 이상일 경우 PASS, 아니면 FAIL
 * 
 * - 중간고사(40), 기말고사(50%), 과제(10%)
 * - 각각 100점 만점 
 * 
 * + PASS인 경우 
 *  90점 이상 : A
 *  80점 이상 : B
 *  70점 이상 : C
 *  60점 이상 : D
 *  
 * </pre>
 * 
 *  
 */
public void method4() { 
	
//	System.out.println("점수를 입력 : ");
//	Scanner sc1 = new Scanner(System.in);
//	float marks1 = sc.nextInt();
//	
//	System.out.println("점수를 입력 : ");
//	Scanner sc2 = new Scanner(System.in);
//	float marks2 = sc.nextInt();
//	
//	
//	System.out.println("점수를 입력 : ");
//	Scanner sc3 = new Scanner(System.in);
//	float marks3 = sc.nextInt();
//	
//	float sum = ((marks1 + marks2 + marks3)/100)*100;
//	
//	String remarks = "PASS";
//	String grades;
//	
//	System.out.println(sum);
//	
//	
//	
//	if(sum >= 60) {
//		remarks = "PASS";
//		
//	}
//	else if (sum < 60) {
//		remarks = "FAIL";
//		System.out.println(remarks);
//	}
//
//	
//	if(remarks == "PASS") {
//		if(sum >= 90) {
//			grades = "A";
//			System.out.println(grades);
//			System.out.println(remarks);
//		}
//		else if(sum >= 80) {
//			grades = "B";
//			System.out.println(grades);
//			System.out.println(remarks);
//		}
//		else if(sum >= 70) {
//			grades = "C";
//			System.out.println(grades);
//			System.out.println(remarks);
//		}
//		else {
//			grades = "D";
//			System.out.println(grades);
//			System.out.println(remarks);
//		}
//		
//	}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간고사 점수 : ");
		int mid = sc.nextInt();
	

		System.out.println("중간고사 점수 : ");
		int fin = sc.nextInt();
		
	
		System.out.println("중간고사 점수 : ");
		int report = sc.nextInt();
		
		//비율이 적용된 점수들의 합
		double total = (mid * 0.4) + (fin * 0.5) + (report * 0.1);
		
		//변수에 아무런 값도 대입되지 않은 경우 사용 불가능
		// 해결 1) 모든 경우에 변수에 값을 대입
		// 해결 2) 변수 선언 시 특정한 값으로 초기화 진행
		//    -> 숫자는 0, String 은 null / "", boolean 은 false
		//			이외의 객체는 null
		
		String result = "";// 변수 선언
		
		if(total >= 60)  { //result = "PASS";
			
			//switch 문 매개변수로는 정수, 문자열
//			char ch = 'a';
			switch((int)(total / 10)) {
			case 10: case 9: result = "A"; break;
			case 8: result = "B"; break;
			case 7: result = "C"; break;
			case 6: result = "D"; break;
			}
		}
		else					  result = "FAIL";
		
		System.out.println(result);
	}

/**<pre> 
 * 국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아
 * 40점 미만 과목이 있으면 FAIL
 * 평균이 60점 미만인 경우도 FAIL
 * 
 * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
 * 
 * [출력 예시]
 * 
 * 1) 40점 미만 과목이 존재하는 경우
 * 
 * FAIL [40점 미만 과목 : 국어 영어]
 * 
 * 
 * 2) 평균 60점 미만인 경우
 * 
 * FAIL [점수 : 50.4 (평균 미달)]
 * 
 * 
 * 3) PASS인 경우
 * 
 * PASS [점수 : 83.4 / 100]
 * 
 * </pre>
 * 
 */
public void method5() {
	Scanner sc= new Scanner(System.in);
	System.out.print("5가지 과목 점수를 입력하세요: 국어, 영어, 수학, 사탐, 과탐:");
	

	
	int kor = sc.nextInt();
	int eng = sc.nextInt();
	int math = sc.nextInt();
	int soc = sc.nextInt();
	int sci = sc.nextInt();
	
	
	
	
	
	
	
	boolean flag = false;
	
	String result = "";
	String remark = "";

	
	
	if(kor < 40)  result += "국어 "; flag = true;  
	if(eng < 40)  result += "영어 "; flag = true;
	if(math < 40) result += "수학 "; flag = true;
	if(soc < 40)  result += "사탐 "; flag = true;
	if(sci < 40)  result += "과탐 "; flag = true;
	
	
	
	
	
	double avg = (kor + eng + math + soc + sci)/5.0;
	
	if (avg < 60.0)   {
		remark = "FAIL";
		System.out.print(remark);
		System.out.print("[점수 :" + avg +" (평균미달)]");
	}else {
		remark = "PASS";
		System.out.print(remark);
		System.out.print("[점수 :" + avg + "]");
	}
	
	
	if(flag==true) {
		remark = "FAIL";
		System.out.printf("40점 미만 과목 : %s", result);
		return;
		}
	
}
}
	

