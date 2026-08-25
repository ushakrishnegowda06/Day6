package day6;

public class Demo2 {

	    public static void main(String[] args) {

	        int[] numbers = {10, 20, 30, 40, 50};
	        int windowSize = 3;

	        for (int i = 0; i <= numbers.length - windowSize; i++) {

	            int sum = 0;

	            for (int j = i; j < i + windowSize; j++) {
	                sum = sum + numbers[j];
	            }

	            System.out.println("Sum = " + sum);
	        }
	    }
	}
