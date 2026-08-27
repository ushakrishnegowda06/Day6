package day6;
import java.util.Scanner;

public class Demo15 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String name = "";
	        String designation = "";
	        int age = 0;
	        double salary = 0;
	        boolean created = false;

	        while (true) {

	            System.out.println("\n1. Create");
	            System.out.println("2. Display");
	            System.out.println("3. Update Salary");
	            System.out.println("4. Exit");

	            System.out.print("Enter choice: ");
	            String choice = sc.nextLine();

	            // CREATE
	            if (choice.equals("1")) {

	                // Name
	                while (true) {
	                    System.out.print("Enter name: ");
	                    name = sc.nextLine();

	                    if (name.matches("[a-zA-Z ]+")) {
	                        break;
	                    }

	                    System.out.println("Enter correct credential");
	                }

	                // Age
	                while (true) {
	                    System.out.print("Enter age: ");
	                    String a = sc.nextLine();

	                    try {
	                        age = Integer.parseInt(a);

	                        if (age > 0) {
	                            break;
	                        }
	                    } catch (Exception e) {
	                    }

	                    System.out.println("Enter correct credential");
	                }

	                // Designation and Salary
	                while (true) {
	                    System.out.print("Enter designation: ");
	                    designation = sc.nextLine();

	                    if (designation.equalsIgnoreCase("Programmer")) {
	                        salary = 15000;
	                        break;
	                    }
	                    else if (designation.equalsIgnoreCase("Tester")) {
	                        salary = 25000;
	                        break;
	                    }
	                    else if (designation.equalsIgnoreCase("Manager")) {
	                        salary = 30000;
	                        break;
	                    }
	                    else {
	                        System.out.println("Enter correct credential");
	                    }
	                }

	                created = true;

	                System.out.println("Employee created successfully");

	            }

	            // DISPLAY
	            else if (choice.equals("2")) {

	                if (created) {
	                    System.out.println("\nName: " + name);
	                    System.out.println("Age: " + age);
	                    System.out.println("Designation: " + designation);
	                    System.out.println("Salary: ₹" + salary);
	                }
	                else {
	                    System.out.println("Create employee first");
	                }
	            }

	            // UPDATE SALARY
	            else if (choice.equals("3")) {

	                if (!created) {
	                    System.out.println("Create employee first");
	                }
	                else {

	                    while (true) {

	                        System.out.print("Enter percentage (1-10): ");
	                        String p = sc.nextLine();

	                        try {
	                            double percentage = Double.parseDouble(p);

	                            if (percentage >= 1 && percentage <= 10) {

	                                salary = salary + (salary * percentage / 100);

	                                System.out.println("Updated Salary: ₹" + salary);
	                                break;
	                            }

	                        } catch (Exception e) {
	                        }

	                        System.out.println("Enter correct credential");
	                    }
	                }
	            }

	            // EXIT
	            else if (choice.equals("4")) {

	                System.out.println("Thank you");
	                break;
	            }

	            // WRONG CHOICE
	            else {
	                System.out.println("Enter correct credential");
	            }
	        }

	        sc.close();
	    }
	}


