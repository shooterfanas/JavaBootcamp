package oopHomeWork;

public class CourseManager {
	
	public void addCourseToCart(Courses course) {
		String havethecourse;
		if(course.haveCourse==true) {
			havethecourse= "Bu kursa sahipsiniz";
		}else {
			havethecourse= "Bu kursa hen�z sahip de�ilsiniz";
		}
		haveTheCourse(
				course.id + 
				course.title + 
				" --- �simli kurs sepete eklendi --- " + 
				havethecourse );
	}
	
	public void haveTheCourse(String mesaj){
		System.out.println(mesaj);
		
	}
}
