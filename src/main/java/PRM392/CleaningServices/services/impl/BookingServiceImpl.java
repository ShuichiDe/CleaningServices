package PRM392.CleaningServices.services.impl;

import PRM392.CleaningServices.dto.request.BookingRequest;
import PRM392.CleaningServices.model.Booking;
import PRM392.CleaningServices.repository.BookingRepository;
import PRM392.CleaningServices.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(BookingRequest bookingRequest) {
        Booking booking = new Booking();
        booking.setCustomer(bookingRequest.getCustomer());
        booking.setService(bookingRequest.getService());
        booking.setAddress(bookingRequest.getAddress());
        booking.setTotalPrice(bookingRequest.getTotalPrice());
        booking.setStatus("Pending");
        booking.setCreatedDate(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getBookingsByUserId(Long userId) {
        return bookingRepository.findByCustomer_UserId(userId);
    }
}
