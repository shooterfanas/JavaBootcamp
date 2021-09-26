
public class Student extends User{
	int stnNo;
	String age;
	String phoneNo;
	String regCourses;
	String progress;
	
	public Student(String firstName, String lastName, String email, int stnNo, String age, String phoneNo, String regCourses, String progress) {
		super(firstName, lastName, email);
		this.stnNo = stnNo;
		this.age = age;
		this.phoneNo = phoneNo;
		this.regCourses=regCourses;
		this.progress=progress;
	}

	public int getStnNo() {
		return stnNo;
	}

	public void setStnNo(int stnNo) {
		this.stnNo = stnNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getregCourses() {
		return regCourses;
	}

	public void setregCourses(String regCourses) {
		this.regCourses = regCourses;
	}
	
	public String getregprogress() {
		return progress;
	}

	public void setregprogress(String progress) {
		this.progress = progress;
	}
	
	
}
