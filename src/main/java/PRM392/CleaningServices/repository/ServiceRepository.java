package PRM392.CleaningServices.repository;

import PRM392.CleaningServices.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    // Tìm kiếm dịch vụ theo tên (có chứa từ khóa)
    List<Service> findByServiceNameContainingIgnoreCase(String keyword);
}
