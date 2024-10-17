package PRM392.CleaningServices.controller;

import PRM392.CleaningServices.dto.request.BookingRequest;
import PRM392.CleaningServices.model.Booking;
import PRM392.CleaningServices.model.Service;
import PRM392.CleaningServices.services.BookingService;
import PRM392.CleaningServices.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private ServiceService serviceService;
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public String returnString() {
        return "CustomerController";
    }

    @GetMapping("/search-services")
    public ResponseEntity<List<Service>> searchServices(@RequestParam String keyword) {
        List<Service> services = serviceService.searchServices(keyword);
        return ResponseEntity.ok(services);
    }
    @PostMapping("/book-service")
    public ResponseEntity<Booking> bookService(@RequestBody BookingRequest bookingRequest) {
        Booking booking = bookingService.createBooking(bookingRequest);
        return ResponseEntity.ok(booking);
    }
    @GetMapping("/check-booking-status/{userId}")
    public ResponseEntity<List<Booking>> checkBookingStatus(@PathVariable Long userId) {
        List<Booking> bookings = bookingService.getBookingsByUserId(userId);
        return ResponseEntity.ok(bookings);
    }

}
