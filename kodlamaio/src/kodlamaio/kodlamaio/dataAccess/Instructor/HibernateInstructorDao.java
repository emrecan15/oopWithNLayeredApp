package kodlamaio.kodlamaio.dataAccess.Instructor;

import kodlamaio.kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Hibernate eklendi. "+instructor.getName());	
	
	}
	
}
