package app.event

/**
 * Created by Kenny on 12/3/2015.
 */
interface IBookingService {
    public String generateBookingForm();
    public int registerNewBooking(Event event, Booking booking);//Returns bookingId
    public void deleteBooking(int bookingId);
    public void updateBooking(Booking booking);
    public List<Booking> getBookingsByEventId(int eventId);

}