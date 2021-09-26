
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Yusuf","Genç","deneme@gmail.com",4,"22","05303333333","Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","80");
		
		StudentManager studentManager= new StudentManager();
		studentManager.register(student1);
		studentManager.login(student1);
		studentManager.logout(student1);
		studentManager.registeredCourses(student1);
		studentManager.progressCourses(student1);
		
		System.out.println("-----------------------------------------");
		
		Instructor instructor1 = new Instructor("Engin","Demiroğ","engindemirog@gmail.com","Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.startLesson(instructor1);
		instructorManager.leaveLesson(instructor1);
	}

}
