package app.event;

import grails.transaction.Transactional;

@Transactional
class BookingService implements IBookingService {

    def serviceMethod() {

    }

    @Override
    String generateBookingForm() {
        return null
    }

    @Override
    int registerNewBooking(Event event, Booking booking) {
        return 0
    }

    @Override
    void deleteBooking(int bookingId) {

    }

    @Override
    void updateBooking(Booking booking) {

    }

    @Override
    List<Booking> getBookingsByEventId(int eventId) {
        return null
    }
}
