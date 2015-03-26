package app.event

import app.filter.CategoryFilter
import grails.transaction.Transactional

@Transactional
class CategoryService implements ICategoryService {

    def serviceMethod() {

    }

    @Override
    List<Category> getAllCategories() {
        def List<Category> getAllCat = Category.findAll()
        return getAllCat
    }

    @Override
    Category getCategoryById(int id) {
        def Category getCatId = Category.findById(id)
        return getCat
    }

    @Override
    List<Category> getCategoryByFilter(CategoryFilter filter) {
        def List<Category> getCatFil
        if (filter.id != NULL) {
            getCatFil = Category.findById(filter.id)
        }
        else if (filter.name != NULL) {
            getCatFil = Category.findByName(filter.name)
        }
        return getCatFil
    }

    @Override
    int addCategory(Category category) {
        def Category addCat = new Category(name: category.name, id: category.id)
        addCat.save()
        return 0
    }

    @Override
    void deleteCategory(Category category) {
        def Category delCat = category.findById(category.id)
        delCat.delete()
    }

    @Override
    void updateCategory(Category category) {
        def Category upCat = category.findById(category.id)
        upCat.name = category.name
    }

    @Override
    void addEventToCategory(Category category, Event event) {
         
    }
}
