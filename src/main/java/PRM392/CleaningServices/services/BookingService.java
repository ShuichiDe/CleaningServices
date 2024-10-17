package PRM392.CleaningServices.services;

import PRM392.CleaningServices.dto.request.BookingRequest;
import PRM392.CleaningServices.model.Booking;

import java.util.List;

public interface BookingService {
    Booking createBooking(BookingRequest bookingRequest);
    List<Booking> getBookingsByUserId(Long userId);
}
