package kodlamaio.kodlamaio.dataAccess.Course;

import kodlamaio.kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi. "+course.getCourseName());
		
	}
	
}
