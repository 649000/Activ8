package app.event

import app.event.forms.BookingForm
import app.event.forms.BookingFormWithSavedState
import app.user.User

/**
 * Created by Kenny on 12/3/2015.
 */
class Booking {
    BookingFormWithSavedState bookingForm;
    User registeredUser;
}
