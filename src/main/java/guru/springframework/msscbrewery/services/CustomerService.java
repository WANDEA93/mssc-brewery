package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getById(UUID id);

    CustomerDTO create(CustomerDTO customerDTO);

    void update(UUID id, CustomerDTO customerDTO);

    void delete(UUID id);
}
