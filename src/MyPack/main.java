package MyPack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		//Initialize Student 1
		s1.name = "Jane Doe";
		s1.id = "N123456";
		s1.gpa = 3.24;
		//...
		
		System.out.println("Student 1 info:");
		System.out.println("Name is; " + s1.name);
		System.out.println("ID is: " + s1.id);
		System.out.println(" GPA is: " + s1.gpa);
		
		Student s2 = new Student();
		//Initialize student 1
		s2.name = "John Doe";
		s2.id = "N38270";
		s2.gpa = 3.45;
		//...
		
		
		System.out.println("Student 1 info:");
		System.out.println("Name is; " + s2.name);
		System.out.println("ID is: " + s2.id);
		System.out.println(" GPA is: " + s2.gpa);
		

	}

}
