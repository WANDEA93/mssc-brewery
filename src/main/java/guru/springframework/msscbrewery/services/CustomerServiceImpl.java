package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getById(UUID id) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Jon Doe")
                .build();
    }

    @Override
    public CustomerDTO create(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID id, CustomerDTO customerDTO) {
        return;
    }

    @Override
    public void delete(UUID id) {
        return;
    }
}
