package assigmentDay3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		System.out.println(instructor.getFirstName());
		
		Student student=new Student();
		student.setFirstName("�ura");
		student.setLastName("kara");
		System.out.println(student.getFirstName());
		// TODO Auto-generated method stub
		
		StudentManager studentManager= new StudentManager();
		studentManager.registerForCourse(student);
		
		StudentManager.registerForCourse();
		
			
			

	}

}
