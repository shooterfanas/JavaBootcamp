
public class InstructorManager extends UserManager{
	
	
	public void startLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli e�itmen " + instructor.getCourseName() +"'da yeni bir ders ba�latt�.");
	}
	
	public void leaveLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " dersten ayr�ld�.");
	}
}
