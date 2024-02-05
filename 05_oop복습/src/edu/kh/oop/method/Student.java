package edu.kh.oop.method;

public class Student {
   public static String schoolName = "KH대학교";
   
   public static final int MIN_VALUE = 0;
   public static final int MAX_VALUE=100;
   
   private String name;					//이름
  private String studentNumber;
   private char gender;
   private int java;
   private int html;
   
//   public Student(String name, String studentNumber, char gender, int java, int html) {
//  	 this.name = name;
//  	 this.studentNumber = studentNumber;
//  	 this.gender = gender;
//  	 this.java = java;
//  	 this.html = html;
//   }
   
//   메서드 
   //setter
   public void setName(String name) {
  	 this.name = name;
   }
   
   public void setStudentNumber(String studentNumber) {
  	 this.studentNumber = studentNumber;
   }
   
   public void setStudentName(String name) {
  	 this.name = name;
   }
   public void setStudentGender(char gender) {
  	 this.gender= gender;
   }
   
   public void setJava(int java) {
  	 this.java = java;
   }
   
   public void setHtml(int html) {
  	 this.html = html;
   }
   
   //getter
   
   public String getName() {
  	 return name;
   }
}
