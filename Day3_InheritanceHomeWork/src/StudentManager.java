
public class StudentManager extends UserManager{
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		super.register(user);
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		super.login(user);
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub
		super.logout(user);
	}
	
	public void registeredCourses(Student student){
		System.out.println("��renci Numaras�: " + student.getStnNo() + " olan " + student.getFirstName() + " " + student.getLastName() + " isimli kullan�c� " + student.getregCourses() + " Kurslara kay�tl�d�r.");
	}
	
	public void progressCourses(Student student) {
		System.out.println(student.getStnNo() + " numaral� ��renci " + student.getregCourses() + " isimli kursu " + " %" + student.getregprogress() + " tamamlam��t�r.");
	}
	
}
