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
}
