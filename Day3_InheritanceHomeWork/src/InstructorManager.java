
public class InstructorManager extends UserManager{
	
	
	public void startLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmen " + instructor.getCourseName() +"'da yeni bir ders baþlattý.");
	}
	
	public void leaveLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " dersten ayrýldý.");
	}
}
