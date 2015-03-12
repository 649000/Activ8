package app.event

import app.filter.EventFilter

/**
 * Created by Kenny on 12/3/2015.
 */
interface IEventService {
    public void createEvent(Event event);
    public void deleteEvent(Event event);
    public void updateEvent(Event event);
    public List<Event> getEventsByFilter(EventFilter eventFilter);
    public Event getEventById(int id);

}