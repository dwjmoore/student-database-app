import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int classYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	Scanner scanner = new Scanner(System.in);
	
	// Constructor to prompt user to enter name and year
	public Student() {
		enterName();
		enterClassYear();
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + classYear + " " + studentID);
	}

	// method to prompt user to enter name
	private void enterName() {
		System.out.print("Enter student first name: ");
		this.firstName = scanner.nextLine();
		System.out.print("Enter student last name: ");
		this.lastName = scanner.nextLine();
	}

	// method to prompt user to enter year
	private void enterClassYear() {
		System.out.print("Enter student class year: ");
		while (!scanner.hasNextInt()) {
			System.out.print("Not a valid entry. Enter student class year: ");
			scanner.next();
		}
		this.classYear = scanner.nextInt();
	}

	// method to create Student ID
	private void setStudentID() {
		studentID = classYear + "" + id;
		id++;
	}

	// method for student to enroll in courses

	// method for student to see tuition balance

	// method for student to pay tuition balance

	// Show status
}