/*
Author: Alex Liang
Lesson: 3.1 - If Statements
Date Created: March 3, 2026
Date Last Modified: March 3, 2026
*/



public class PracticeProblem{

	public static void main(String[] args) {
	
	}
	
	public static String evenOrOdd(int num){
	    String result;
	    if (num % 2 == 0){
	        result = "Even";
	    } else {
	        result = "Odd";
	    }
	    return result;
	}
	
	public static String teacherOrStudent(String input){
	    String result;
	    if (input == "Kalisz"){
	        result = "Teacher";
	    } else {
	        result = "Student";
	    }
	    return result;
	}
	
	public static int fartherFromZero(int num){
	    int result = 0;
	    if (num > 0){
	       result = num + 5;
	    } 
	    if (num < 0){
	       result = num - 5;
	    }
	    return result;
	}
	    
}
