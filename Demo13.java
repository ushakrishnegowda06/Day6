package day6;

public class Demo13 {

	public static void main(String[] args) {
		String[]array1 = {"usha", "supriya", "teja"};
		String[] array2 = {"swati", "srinivas", "gunda"};
		String[]merged = new String[array1.length + array2.length];
		for(int i = 0; i< array1.length; i++) {
			merged[i] = array1[i];
		}
		for(int i = 0; i<array2.length; i++) {
			merged[array1.length+i] = array2[i];
		}
		System.out.println("Union:");
		for(int i= 0;i<merged.length;i++) {
			System.out.print(merged[i]+"");
		}
		

	}


	}


