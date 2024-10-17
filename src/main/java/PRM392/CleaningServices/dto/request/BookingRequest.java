package PRM392.CleaningServices.dto.request;

import PRM392.CleaningServices.model.Address;
import PRM392.CleaningServices.model.Service;
import PRM392.CleaningServices.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingRequest {
    private User customer;
    private Service service;
    private Address address;
    private Double totalPrice;
}
