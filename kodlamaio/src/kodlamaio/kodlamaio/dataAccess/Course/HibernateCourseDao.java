package kodlamaio.kodlamaio.dataAccess.Course;

import kodlamaio.kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi. "+course.getCourseName());
		
	}
	
}
