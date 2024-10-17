package PRM392.CleaningServices.services.impl;

import PRM392.CleaningServices.model.Service;
import PRM392.CleaningServices.repository.ServiceRepository;
import PRM392.CleaningServices.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Service createService(Service service) {
        service.setCreatedDate(LocalDateTime.now());
        return serviceRepository.save(service);
    }

    @Override
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    @Override
    public Service getServiceById(Long id) {
        return serviceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found with id: " + id));
    }


    @Override
    public Service updateService(Long ServiceId, Service service) {
        Service serviceToUpdate = getServiceById(ServiceId);
        serviceToUpdate.setServiceName(service.getServiceName());
        serviceToUpdate.setPrice(service.getPrice());
        serviceToUpdate.setDuration(service.getDuration());
        serviceToUpdate.setDescription(service.getDescription());
        serviceToUpdate.setCreatedDate(service.getCreatedDate());
        return serviceRepository.save(serviceToUpdate);
    }

    @Override
    public void deleteServiceById(Long id) {
        Service serviceToDelete = getServiceById(id);
        serviceRepository.delete(serviceToDelete);
    }
    @Override
    public List<Service> searchServices(String keyword) {
        return serviceRepository.findByServiceNameContainingIgnoreCase(keyword);
    }


}
