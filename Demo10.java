package day6;

public class Demo10 {

	public static void main(String[] args) {
		int[] expenses = {100, 200, 150, 900, 250};
        int sum = expenses[0] + expenses[1] + expenses[2];
        int max = sum;

        for (int i = 3; i < expenses.length; i++) {
            sum = sum - expenses[i - 3] + expenses[i];

            if (sum > max)
                max = sum;
        }

        System.out.println("Highest Profit = ₹" + max);

	}

}
