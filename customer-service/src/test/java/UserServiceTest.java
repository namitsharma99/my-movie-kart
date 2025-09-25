import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mymoviekart.customer.dto.response.CustomerResponseDto;
import com.mymoviekart.customer.entity.CustomerEntity;
import com.mymoviekart.customer.repository.CustomerRepository;
import com.mymoviekart.customer.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testFindUserById() {
        // Given
        Long customerId = 21L;
        String mockJson = "{\"id\":21,\"customerName\":\"Mukesh\",\"emailId\":\"bingewatcher2@gmail.com\",\"contactNumber\":\"65258933\",\"nationality\":\"Indian\",\"nationalId\":\"98451\",\"createdDate\":\"2025-09-25T20:08:39.599+05:30\"}";
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssz").create();
        CustomerEntity mockCustomerEntity = gson.fromJson(mockJson, CustomerEntity.class);

        // Setup
        when(customerRepository.findById(customerId)).thenReturn(Optional.of(mockCustomerEntity));

        // Event
        CustomerResponseDto foundCustomerResponseDto = customerService.getCustomerById(customerId);

        // Test
        assertEquals(mockCustomerEntity.getId(), foundCustomerResponseDto.getId());
        assertEquals(mockCustomerEntity.getCustomerName(), foundCustomerResponseDto.getCustomerName());
    }

}