package app.event

import app.filter.CategoryFilter
import grails.transaction.Transactional

@Transactional
class CategoryService implements ICategoryService {

    def serviceMethod() {

    }

    @Override
    List<Category> getAllCategories() {
        return null
    }

    @Override
    Category getCategoryById(int id) {
        return null
    }

    @Override
    List<Category> getCategoryByFilter(CategoryFilter filter) {
        return null
    }

    @Override
    int addCategory(Category category) {
        return 0
    }

    @Override
    void deleteCategory(Category category) {

    }

    @Override
    void updateCategory(Category category) {

    }

    @Override
    void addEventToCategory(Category category, Event event) {

    }
}
