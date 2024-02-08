package edu.kh.practice;

import java.util.Scanner;

//class Member { //default class
public class Member { // public class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁인"};
		
		System.out.println("검색할 회원 이름을 입력하세요 : ");
		
		String searchName = sc.next();
		
		
		boolean result = false;
		for(int i = 0; i < memberArr.length; i++) {
			
			if( memberArr[i] == searchName) {
				break;
			}
			 result = false;
		
		}
		
		if(result == false ) {
			System.out.println("회원이 존재하지 않습니다");
		}else {
			System.out.println("회원이 존재합니다");
		}
		
	
		
		
	
		
		
	}
}
