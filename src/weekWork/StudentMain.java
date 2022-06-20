package weekWork;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1= new Student("A",90,95,85,55,80);
		
		System.out.println("Student 2= "+student1.percentageCalculation());
		
		Student student2= new Student("B",100,65,25,95,70);
		
		System.out.println("Student 2= "+student1.percentageCalculation());

	}

}
