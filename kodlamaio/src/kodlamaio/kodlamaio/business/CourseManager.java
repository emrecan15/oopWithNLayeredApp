package kodlamaio.kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.kodlamaio.core.logging.Logger;
import kodlamaio.kodlamaio.dataAccess.Course.CourseDao;
import kodlamaio.kodlamaio.entities.Course;

public class CourseManager {
	
	private final CourseDao courseDao;
	private final Logger[] loggers;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	List<String> courses = new ArrayList<String>();
	
	public void add(Course course) throws Exception {
		System.out.println("----------------------");
		
		if(courses.contains(course.getCourseName()))
		{
			throw new Exception("This course already exist: " + course.getCourseName());
		}
		else if(course.getCoursePrice() < 0) {
			throw new Exception("Course price cannot be less than 0 " + course.getCourseName());
		}
		else
		{
			courses.add(course.getCourseName());
			courseDao.add(course);
			
			
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
			
		}
		
	}
	
}
