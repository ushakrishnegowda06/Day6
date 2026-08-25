package day6;

public class Demo9 {

	public static void main(String[] args) {
		int[]marks = {10, 20, 34, 30, 25};
		int[]prefixSum = new int[marks.length];
		prefixSum[0] = marks[0];
		for(int i= 1; i < marks.length; i++){
			prefixSum[i] = prefixSum[i - 1]+ marks[i];
		}
		int sum = prefixSum[3] - prefixSum[0];
		System.out.println("Total marks = " + sum);


	}

}
