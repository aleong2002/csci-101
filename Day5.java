package finalexam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Day5 {
	public static void main(String[] args) {
		Stack<Integer> x = new Stack<>();
		List<Integer> grades = new ArrayList<Integer>(Arrays.asList(73, 67, 38, 33));
		System.out.println(gradingStudents(grades));
	}
	public static List<Integer> gradingStudents(List<Integer> grades) { 
		for (int i = 0; i < grades.size(); i++) {
	        if (grades.get(i) < 38) {
	            continue;
	        }
	        
	        else {
	            int mult = 5 * Math.round(grades.get(i) /5 + 1);
	            if (mult - grades.get(i) < 3) {
	                grades.set(i, (int) mult);
	            }
	        }
	    }
	    return grades;
	 }
}
