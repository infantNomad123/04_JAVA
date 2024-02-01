package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	/**
	 * 실습문제 1
	 */
	public void practice1() {
		int[] arr = new int[9];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.printf("짝수 번째 인덱스 합: %d", sum);
	}

	public void practice2() {
		int[] arr = new int[9];

		int sum = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if (i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.printf("짝수 번째 인덱스 합: %d", sum);
	}
	
	public void practice3() {
		System.out.println("양의 정수 :");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
		int[] arr = new int[5];
		for(int i =0; i<arr.length; i++) {
			System.out.printf("입력 %d :", i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.print("검색할 값 :");
		int search = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			
			if(search == arr[i]) {
				System.out.printf("인덱스 : %d",i);
				return;
			}
		}
		System.out.println("일치하지 않는 값입니다");
	}
	
	public void practice5() {
		
		System.out.println("정수 :");
		int input = sc.nextInt();
		int [] arr = new int[input];
		
		int sum = 0; // 합계 누적용 변수
		
		for(int i =0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		for(int j =0; j < arr.length; j++) {
			System.out.print(arr[j] + " " );
			sum+=arr[j];
		}
//		System.out.println();
		System.out.println("\n총  합 :" + sum);
		
	}
	
	public void practice6() {
//		System.out.print("주민등록번호( - 포함) : ");
//		char [] a = sc.next().toCharArray();			
//		for(int i = 0; i<a.length; i++) {
//			if( i > 7) {
//				a[i] = '*';
//			}
//		}
//		System.out.print(a);
		
		char [] arr = new char[14];
		
		System.out.print("주민등록번호 (-포함) :");
		String input = sc.nextLine();
		
//		int len = input.length();
		for(int i =0, len = input.length(); i < len; i++) {
			
			if(i <= 7 ) {
				arr[i] = input.charAt(i);
			}
			else {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}
	
	
	
	public void practice7() {

		//while 문으로 조건에 맞는 수가 입력 될 때 까지 반복
		// +break
		
		// 배열 요소에 대입되는 숫자는 count 값을 ++, -- 를 이용해 제어
		int len = 0;
		while(true) { //무한 루프
									// 3이상의 홀수가 입력될때 까지 무한 반복
			System.out.print("정수 : ");
			len = sc.nextInt();
			
			//입력 받은 정수가 3 이상의 홀수인 경우 반복 종료
			if(len > 3  && len % 2 == 1) {
				break;
			}
			
			//if문이 수행 X == 3 이상이 아니거나ㅣ 짝수인 경우
			System.out.println("다시 입력하세요");
		}
		
		// 입력받은  정수 크기 만큼의 배열 선언, 할당
		int[] arr = new int[len];
		
		int count = 0; // arr 배열 요소에 대입될 수
		
		for(int i =0; i < len; i++) {
			
			//배열 길이 절반 이하인 경우 증가, 이후인 경우 감소
			if(i <= len / 2) count++;
			else						 count--;
			
			arr[i] = count; // count 값 배열 요소에 대입
		}
		
		//Arrays.toString(배열명)
		// - 배열 내 요소를 "[1,2,3]" 형식의 문자열로 만들어 반환
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * [실습문제8]
	 */
	public void practice8() {
		int[] randoms = new int[10];
		
		
		String str = ""; //빈 문자열
		
		for(int i = 0; i < randoms.length; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
		}
		System.out.println("발생한 난수 : " +str );
}
	
	/**
	 * [실습문제9]
	 */	
public void practice9() {
	int[] randoms = new int[10];
	
	
	String str = ""; //빈 문자열
	
	int max = 0; ; //최대값 저장용 변수
	int min = 0; // 최소값 저장할 변수
	
	for(int i = 0; i < randoms.length; i++) {
		
		randoms[i] = (int)(Math.random() * 10 + 1); // 1 < a < 11 
		str += randoms[i] + " ";
		
		if(i == 0) { // 첫 반복인 경우 -> 첫 번째 난수를 비교 기준으로 삼음
			max = randoms[i];
			min = randoms[i];
			continue; //다음 반복으로 이동
		}
	
		
		//첫 반복이 아닌 경우
		if(randoms[i] > max) max = randoms[i];
		if(randoms[i] < min) min = randoms[i];
		
	}
	System.out.println("발생한 난수 : " +str);
	System.out.println("최대값 난수 : " +max );
	System.out.println("최소값 난수 : " +min );
	}
	

	/**
	 * [실습문제10]
	 */
	public void practice10() {
		int[] randoms = new int[4];
				String str = ""; //빈 문자열
				
				//난수 생성용 for 문
				for(int i = 0; i < randoms.length; i++) {
					randoms[i] = (int)(Math.random() * 10 + 1);
					
					//* 중복 검사 방법
					// 현재 잍젝스에 대입된 난수와 같은 값이 
					// 앞쪽 인덱스에 존재하면
					// 다시 현재 인덱스에 새로운 난수를 생성해서 대입
					// (중복이 없을 때 까지 반복)
					
					//현재 인덱스 앞쪽 까지만 순차 접근하는 for문 작성
					for(int x = 0; x < i; x++) 
						
						//현재 인덱스에 저장된 값(지금 발생한 난수)
						// 앞쪽 인덱스에 저장된 값이 (이전에 발생한 난수가)
						// 같을 경우 "중복" 으로 판단!
						if(randoms[i] == randoms[x] ) {
							i--; // 바깥쪽 for 문의 i 값 증가를 막아서
								   // 현재 인덱스 번째 요소에 다시 새로운 난수를 대입하게함
							
							break; // 중복을 발견 했으니 추가적인 검사가 필요없음
						}
					}
				
				//출력 구문 만들기용 for 문
				for(int i = 0; i < randoms.length; i++) {
					str += randoms[i] + " ";
				}
				System.out.println("발생한 난수 : " +str );
	  }
	public void practice11() {
		int[] lotto = new int[6];
		
		// 2. 1 ~ 45 사이 중복 없는 난수로 lotto 배열 요소 초기화
		for(int i=0 ; i<lotto.length ; i++) {
			
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int x=0 ; x < i ; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}
		
		//3. 오름차순 정렬(선택 정렬)
//		for(int i = 0;i  < lotto.length - 1; i++) { //칸 지정 (비교 주체)
//			
//			for(int x = i+1 ; x < lotto.length; x++) { //비교 대상
//				
//				//주체 > 대상 -> 오름 차순
//				//주제 < 대상 -> 내림 차순
//				
//				if(lotto[i] >lotto[x]) { // 주체가 대상보다 크면 교체 (swap)
//					int temp = lotto[i];
//					lotto[i] = lotto[x];
//					lotto[x] = temp;
//				}
//			}
//		}
		
		Arrays.sort(lotto); // 자바에서 만들어서 제공해주는 
												// 배열 오름차순 정렬 기능 
		// 결과 출력
		System.out.println(Arrays.toString(lotto));
	}
}
