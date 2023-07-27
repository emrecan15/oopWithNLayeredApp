package kodlamaio.kodlamaio.dataAccess.Instructor;

import kodlamaio.kodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile eklendi. "+instructor.getName());
		
	}
	
}
