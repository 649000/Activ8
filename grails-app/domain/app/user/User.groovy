package app.user

import app.event.Event
import app.event.Subcategory

class User {
    
    String userid
    String password
    String email
    
    static constraints =
    {
        userid(blank: false)
        password(blank: false, minSize: 8)
        email(blank: false)
    }
    
    //If user adds "category" to its preferences, will add all of its subcategory,
    //If user add "subcategory" just add that individual category

    
    
}
