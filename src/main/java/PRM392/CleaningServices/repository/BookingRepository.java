package PRM392.CleaningServices.repository;

import PRM392.CleaningServices.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Tìm booking theo userId
    List<Booking> findByCustomer_UserId(Long userId);
}
