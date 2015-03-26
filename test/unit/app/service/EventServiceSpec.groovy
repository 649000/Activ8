package app.service

import app.event.CategoryService
import app.event.Event
import app.event.EventService
import app.filter.EventFilter
import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.runtime.FreshRuntime
import org.junit.Assert
import spock.lang.Specification
import grails.test.mixin.support.GrailsUnitTestMixin
import grails.test.mixin.services.ServiceUnitTestMixin
/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@FreshRuntime
@TestMixin(ServiceUnitTestMixin)
@TestFor(EventService)
class EventServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }
    private void createMockEvent(){
        Event event = new Event();
        event.name = "asd";
        event.maxCapacity = 5;
    }
    def "grailsApplication is not null"() {
        expect:
        grailsApplication != null
    }
    def "Test_event_creation"() {
        given:
        Event mockEvent = createMockEvent();
        EventService eventService = new EventService();
        CategoryService categoryService = new CategoryService();
        when:
        List<Category> allCategories = categoryService.getAllCategories();
        Category defaultCategory = allCategories.get(0);
        //Create event 
        int eventId = eventService.createEvent(mockEvent);
        //Retrieve created event
        Event retrievedEvent = eventService.getEventById(eventId);
        //Add events to category
        eventService.addEventToCategory(defaultCategory, mockEvent);
        EventFilter eventFilter = new EventFilter();
        eventFilter.categoryId = defaultCategory.categoryId;
        def eventList = eventService.getEventsByFilter(eventFilter);
        boolean hasFoundEvent = false;
        for (Event event: eventList){
            if (event.name == mockEvent.name && event.id) 
                {hasFoundEvent = true; break;}
        }
        //Delete created event
        eventService.deleteEvent(retrievedEvent);
        then:
        eventId != 0
        mockEvent.getName() == retrievedEvent.getName()
        retrievedEvent != null
        hasFoundEvent == true 
    }
}
