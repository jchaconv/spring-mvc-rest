package expert.springframework.springmvcrest.mapper;

import expert.springframework.springmvcrest.domain.Customer;
import expert.springframework.springmvcrest.model.CustomerDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-13T10:33:37-0500",
    comments = "version: 1.2.0.CR2, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerToCustomerDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setFirstname( customer.getFirstname() );
        customerDTO.setLastname( customer.getLastname() );

        return customerDTO;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setFirstname( customerDTO.getFirstname() );
        customer.setLastname( customerDTO.getLastname() );

        return customer;
    }
}
