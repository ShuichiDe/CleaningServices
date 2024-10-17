package PRM392.CleaningServices.services;

import PRM392.CleaningServices.model.Service;

import java.util.List;

public interface ServiceService {
    Service createService(Service service);
    List<Service> getAllServices();
    Service getServiceById(Long id);
    Service updateService(Long ServiceId, Service service);
    void deleteServiceById(Long id);
    List<Service> searchServices(String keyword);
}
