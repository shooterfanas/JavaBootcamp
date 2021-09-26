package oopHomeWork;

public class CourseManager {
	
	public void addCourseToCart(Courses course) {
		String havethecourse;
		if(course.haveCourse==true) {
			havethecourse= "Bu kursa sahipsiniz";
		}else {
			havethecourse= "Bu kursa henüz sahip değilsiniz";
		}
		haveTheCourse(
				course.id + 
				course.title + 
				" --- İsimli kurs sepete eklendi --- " + 
				havethecourse );
	}
	
	public void haveTheCourse(String mesaj){
		System.out.println(mesaj);
		
	}
}
