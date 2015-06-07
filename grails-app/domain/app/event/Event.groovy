package app.event

class Event {
    
    String name
    String description
    boolean status
    boolean privateStatus
    String location
    Date startDateTime
    Date endDateTime
    int maxNoOfAttendees
    double fees
    
    //Event belongs to many subcategories
   

    static constraints = {
        name(blank: false)
        description(blank: false)
    }
    
    static hasMany = [subcategory:Subcategory]
}
