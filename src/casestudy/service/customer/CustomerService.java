package casestudy.service.customer;

import casestudy.entity.Customer;
import casestudy.repository.customer.CustomerRepository;
import casestudy.repository.customer.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAllCustomer();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustumer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.updateCustumer(customer);
    }

    @Override
    public Customer searchId(String id) {
        return customerRepository.searchId(id);
    }
}
