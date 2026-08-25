package day6;

public class Demo7 {

	public static void main(String[] args) {
		int[] marks = {75, 82, 68, 95, 88};

        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        System.out.println("Highest score = " + highest);
	}

}
