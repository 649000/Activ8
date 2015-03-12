package app.event

import app.filter.EventFilter
import grails.transaction.Transactional

@Transactional
class EventService implements IEventService {

    def serviceMethod() {

    }

    @Override
    int createEvent(Event event) {
        return 0
    }

    @Override
    void deleteEvent(Event event) {

    }

    @Override
    void updateEvent(Event event) {

    }

    @Override
    List<Event> getEventsByFilter(EventFilter eventFilter) {
        return null
    }

    @Override
    Event getEventById(int id) {
        return null
    }
}
