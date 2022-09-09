//	08. Write a program to demonstrate the functionalities of static keyword.

package com.sixty.questions;

class Student{  
    int rollno;  
    String name;  
    static String college = "IIT"; 
    
//  static method to change the value of static variable  
    
    static void change(){  
    	college = "Anna University";  
    }
    
//  constructor to initialize the variable  
    
    Student(int r, String n){  
    	rollno = r;  
    	name = n;  
    }
    
//  method to display values  
    
    void display(){
    	System.out.println(rollno+" "+name+" "+college);
    }  
}  

public class Question_No_08 {

	public static void main(String[] args) {
		
		Student.change();
		
//		Calling change Method
		
	    Student s1 = new Student(111,"Karan");  
	    Student s2 = new Student(222,"Aryan");  
	    Student s3 = new Student(333,"Sonoo");
	    
//	    calling display method
	    
	    s1.display();  
	    s2.display();  
	    s3.display(); 
	}
}