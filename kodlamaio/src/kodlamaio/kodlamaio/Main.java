package kodlamaio.kodlamaio;

import kodlamaio.kodlamaio.business.CategoryManager;
import kodlamaio.kodlamaio.business.CourseManager;
import kodlamaio.kodlamaio.business.InstructorManager;
import kodlamaio.kodlamaio.core.logging.FileLogger;
import kodlamaio.kodlamaio.core.logging.Logger;
import kodlamaio.kodlamaio.core.logging.MailLogger;
import kodlamaio.kodlamaio.dataAccess.Category.JdbcCategoryDao;
import kodlamaio.kodlamaio.dataAccess.Course.HibernateCourseDao;
import kodlamaio.kodlamaio.dataAccess.Instructor.JdbcInstructorDao;
import kodlamaio.kodlamaio.entities.Category;
import kodlamaio.kodlamaio.entities.Course;
import kodlamaio.kodlamaio.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Logging 
		
		Logger[] logger = {new FileLogger(),new MailLogger()};
		
		
		Category category1 = new Category("Programlama");
		Category category2 = new Category("Programlama2");
		
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),logger);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		
		System.out.println();
		System.out.println("***************************");
		System.out.println();
		
		Course course1 = new Course(1,"Java ile Programlama",1000);
		Course course2 = new Course(2,"Java ile Programlama2",1000);
		Course course3 = new Course(3,"C# ile Programlama",2000);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),logger);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		
		System.out.println();
		System.out.println("***************************");
		System.out.println();
		
		
		Instructor instructor1 = new Instructor(1,"Emre","Can");
		Instructor instructor2 = new Instructor(2,"Engin","Demirog");
		Instructor instructor3 = new Instructor(3,"Ali","Veli");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),logger);
		
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		instructorManager.add(instructor3);
	}

}
