package app

class Event {
    
    String name
    String description
    String status
    Date startDate
    Date endDate
    int maxCapacity
    int numberOfParticipants
    //int cost
    
    //Event belongs to many subcategories
   

    static constraints = {
        name(blank: false)
        description(blank: false)
        status(blank: false)
        startDate(blank: false)
        endDate(blank: false)
        maxCapacity(blank: false)
        numberOfParticipants(blank: false)
    }
    
    static hasMany = [subcategory:Subcategory]
}
