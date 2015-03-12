package app.event

/**
 * Created by Kenny on 12/3/2015.
 */
interface IBookingService {
    public String generateBookingForm();
    public void registerNewBooking(Booking booking);
    public void deleteBooking(int bookingId);

}