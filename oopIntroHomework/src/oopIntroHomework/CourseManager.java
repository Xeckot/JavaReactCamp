package oopIntroHomework;

public class CourseManager {
	
	public void registerCourse(Course course) {
		System.out.println(course.name + "na kay�t ba�ar�l�.");
	}
	
	public void selectInstructor(Instructor instructor) {
		System.out.println("E�itmen " + instructor.firstName + " " + instructor.lastName + " olarak belirlendi.");
	}

	
}
