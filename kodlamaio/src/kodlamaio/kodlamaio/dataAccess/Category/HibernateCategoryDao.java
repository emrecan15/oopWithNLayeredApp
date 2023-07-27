package kodlamaio.kodlamaio.dataAccess.Category;

import kodlamaio.kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile eklendi. "+category.getCategoryName());
		
	}

}
