package oopIntroHomework;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		Course course1 = new Course();
		course1.id = 1;
		course1.image = "image url";
		course1.name = "Java&React Geliştirme Kampı";
		course1.instructor = instructor1;
		course1.progressRate = 25;

		Instructor instructor2 = new Instructor(2, "Mustafa", "Deveci");
		Course course2 = new Course();
		course2.id = 2;
		course2.image = "image url";
		course2.name = "C# Geliştirme Kampı";
		course2.instructor = instructor2;
		course2.progressRate = 0;

		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.name);

		}

		CourseManager courseManager = new CourseManager();
		courseManager.registerCourse(course1);
		courseManager.registerCourse(course2);
		
		courseManager.selectInstructor(instructor1);
		courseManager.selectInstructor(instructor2);

	}
}
