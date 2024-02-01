package edu.kh.array.practice;

import java.util.Scanner;

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
			}
			
		}
	}
	
	public void practice5() {
		
		System.out.println("정수 :");
		int input = sc.nextInt();
		int [] arr = new int[input];
		
		int sum = 0;
		
		for(int i =0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		for(int j =0; j < arr.length; j++) {
			System.out.print(arr[j] + " " );
			sum+=arr[j];
		}
		System.out.println();
		System.out.printf("총  합 : %d",sum);
		
	}
	
	public void practice6() {
		char nationalId = 0;
		
		
		
			System.out.println("주민등록 번호를 입력해주세요: ");
		  int i =0;
		  nationalId += sc.next().charAt(i);
		  i++;
		
		
		
		
	}
}
