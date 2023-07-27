package kodlamaio.kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.kodlamaio.core.logging.Logger;
import kodlamaio.kodlamaio.dataAccess.Instructor.InstructorDao;
import kodlamaio.kodlamaio.entities.Instructor;

public class InstructorManager {
	private final InstructorDao instructorDao;
	private final Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	List<String> instructors = new ArrayList<String>();
	
	public void add(Instructor instructor) throws Exception {
		System.out.println("-----------------------");
		
		if(instructors.contains(instructor.getLastName())) {
			throw new Exception("This Intructos already exist : "+instructor.getName()+" "+instructor.getLastName());
		}
		else
		{
			instructors.add(instructor.getLastName());
			instructorDao.add(instructor);
			
			for (Logger logger : loggers) {
				logger.log(instructor.getName()+" "+instructor.getLastName());
				
			}
		}
		
	}
}
