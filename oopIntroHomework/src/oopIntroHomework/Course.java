package oopIntroHomework;

public class Course {

	int id;
	String name;
	String image;
	Instructor instructor;
	double progressRate;
	
	public Course() {
		
	}

	public Course(int id, String name, String image, Instructor instructor, double progressRate) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.instructor = instructor;
		this.progressRate = progressRate;
	}

}
