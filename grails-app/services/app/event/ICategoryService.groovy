package app.event

import app.filter.CategoryFilter

/**
 * Created by Kenny on 12/3/2015.
 */
interface ICategoryService {
    public List<Category> getAllCategories();
    public Category getCategoryById(int id);//Returns categoryId
    public List<Category> getCategoryByFilter(CategoryFilter filter);
    public int addCategory(Category category);
    public void deleteCategory(Category category);
    public void updateCategory(Category category);
    public void addEventToCategory(Category category, Event event);
}
