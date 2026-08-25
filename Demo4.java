package day6;

public class Demo4 {
	public static void main(String[]args) {
		int[] numbers = { 2, 3, 1, 2, 4, 3 };
		int target = 9;
		int start = 0;
		int sum = 0;
		int minLength = numbers.length;
		for(int end = 0; end < numbers.length; end++) {
			sum = sum + numbers[end];
			while (sum>=target) {
				int length = end - start + 1;
				if(length < minLength) {
					minLength = length;
				}
				sum =sum - numbers[start];
				start++;	
			}
		}
		System.out.println("Highest window length ="+minLength);
	}
}


