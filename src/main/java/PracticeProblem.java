/*
Author: Alex Liang
Lesson: 3.1 - If Statements
Date Created: April 3, 2026
Date Last Modified: April 3, 2026
*/



public class PracticeProblem{

	public static void main(String[] args) {
	
	}
	
	public static String evenOrOdd(int num){
	    String result;
	    if (num % 2 == 0){
	        return "Even";
	    }
	    return "Odd";
	}
	
	public static String teacherOrStudent(String input){
	    String result;
	    if (input == "Kalisz"){
	        return "Teacher";
	    }
	    return "Student";
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
