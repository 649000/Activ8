package app

class Subcategory {
    
    String name
    
    //Subcategories has many categories
    

    static constraints = {
        name(blank: false)
    }
    
    static hasMany = [category:Category]
    static belongsTo = Category
}
