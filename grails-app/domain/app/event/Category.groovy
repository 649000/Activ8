package app.event

class Category {

    String name

    //Category has many subcategories
    static constraints =
    {
        name(blank: false)
    }
    
    static hasMany = [subcategory:Subcategory]
}
