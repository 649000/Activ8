package app

class User {
    
    String userid
    String name
    String password
    String email
    int phoneNumber
    String address
    
    static constraints =
    {
        userid(blank: false)
        password(blank: false, minSize: 8)
        name(blank: false)
        email(blank: false)
        phoneNumber(blank: false)
        address(blank: false)
    }
    
    //If user adds "category" to its preferences, will add all of its subcategory,
    //If user add "subcategory" just add that individual category
    static hasMany = [preferences:Subcategory, event:Event]
    
}
