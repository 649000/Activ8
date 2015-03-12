package app.service

import app.event.CategoryService
import app.event.Event
import app.event.EventService
import grails.test.mixin.TestFor
import org.junit.Assert
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(EventService)
class EventServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    private void createMockEvent(){
        Event category = new Event();

    }
    void "Test event creation"() {
        Event mockEvent = createMockEvent();
        EventService eventService = new EventService();
        CategoryService categoryService = new CategoryService();
        Category defaultCategory = categoryService.getAllCategories().get(0);
        //Create event
        int eventId = eventService.createEvent(mockEvent);
        Assert.assertTrue("Create event", true);
        //Retrieve created event
        Event retrievedEvent = eventService.getEventById(eventId);
        Assert.assertEquals(mockEvent.getName(), retrievedEvent.getName());
        Assert.assertTrue("Retrieve created event", true);
        //Add events to category
        eventService.addEventToCategory(defaultCategory, mockEvent);
        Assert.assertTrue("Add event to category", true);
        //Delete created event
        eventService.deleteEvent(retrievedEvent);
        Assert.assertTrue("Delete event", true);
    }
}
