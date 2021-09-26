
public class Instructor extends User{
	
	String courseName;

	public Instructor(String firstName, String lastName, String email, String courseName) {
		super(firstName, lastName, email);
		
		this.courseName = courseName;
	}

	

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
