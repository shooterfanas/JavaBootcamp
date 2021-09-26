package oopHomeWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Courses course1= new Courses(
				1,
				"https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Zk7d1MdoSJ6cEShVbfd0",
				"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",
				"Engin Demiroð",
				true
				);
		
		Courses course2= new Courses(
				2,
				"https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/qi4s19xSKCmtaaRUqUFI",
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",
				"Engin Demiroð",
				false
				);
		Courses course3= new Courses(
				3,
				"https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/BBLmG3XFTtm8XBTrzg4v",
				"Programlamaya Giriþ için Temel Kurs",
				"Engin Demiroð",
				true
				);
		
		
		Courses[] courses= {course1,course2,course3};
		
		for (Courses course : courses) {
			System.out.println(course.title);
		}
		
		CourseManager coursemanager= new CourseManager();
		
		coursemanager.addCourseToCart(course1);
		coursemanager.addCourseToCart(course2);
		coursemanager.addCourseToCart(course3);
		
		
		
	}

}
