package kodlamaio.kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.kodlamaio.core.logging.Logger;
import kodlamaio.kodlamaio.dataAccess.Category.CategoryDao;
import kodlamaio.kodlamaio.entities.Category;

public class CategoryManager {
	
	private final CategoryDao categoryDao;
	private final Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao,Logger[] logger) {
		this.categoryDao = categoryDao;
		this.loggers = logger;
	}


	List<String> categories = new ArrayList<String>();

	public void add(Category category) throws Exception {
		// iş kuralları

		if(categories.contains(category.getCategoryName()))
		{
			throw new Exception("This category already exist: " + category.getCategoryName());
		}
		
		else {
			categories.add(category.getCategoryName());
			categoryDao.add(category);
			
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
			System.out.println("------------------");
		}
	}
}
