package day6;

public class Demo1 {

	public static void main(String[] args) {

	        String[] subjects = {"Java", "Python"};
	        int[] marks = {50, 30};

	        int target = 80;

	        int left = 0;
	        int right = marks.length - 1;

	        while (left < right) {

	            int sum = marks[left] + marks[right];

	            if (sum == target) {
	                System.out.println("Subjects found:");
	                System.out.println(subjects[left] + " = " + marks[left]);
	                System.out.println(subjects[right] + " = " + marks[right]);
	                System.out.println("Total = " + sum);
	                break;
	            }
	            else if (sum < target) {
	                left++;
	            }
	            else {
	                right--;
	            }
	        }
	}

}
