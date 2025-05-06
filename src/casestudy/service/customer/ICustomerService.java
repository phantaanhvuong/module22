package casestudy.service.customer;

import casestudy.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomer();
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    Customer searchId(String id);
}
