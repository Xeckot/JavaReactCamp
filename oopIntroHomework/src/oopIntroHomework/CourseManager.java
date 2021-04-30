package oopIntroHomework;

public class CourseManager {
	
	public void registerCourse(Course course) {
		System.out.println(course.name + "na kayýt baþarýlý.");
	}
	
	public void selectInstructor(Instructor instructor) {
		System.out.println("Eðitmen " + instructor.firstName + " " + instructor.lastName + " olarak belirlendi.");
	}

	
}
