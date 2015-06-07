package app.user

import app.event.Event
import app.event.Subcategory

class Attendee extends User{
    
    String firstName
    String lastName
    Calendar dateOfBirth
    String homeNumber
    String mobileNumber
    String streetAddress
    String blockNumber
    String unitNumber
    String zipCode
    String country
    
    

    static constraints = {
    }
    
    static hasMany = [preferences:Subcategory, event:Event]
}
