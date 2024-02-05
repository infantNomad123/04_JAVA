package edu.kh.oarr.model.run;

import edu.kh.oarr.model.view.StudentView;

//자바 프로그램 실행용 클래스
public class StudentRun {
	public static void main(String[] args) {
		
		//실행시 view 객체의 displauMenu() 메서드 호출
		new StudentView().displayMenu();
	}
}
