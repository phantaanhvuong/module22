package casestudy.repository.customer;

import casestudy.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAllCustomer();
    void addCustumer(Customer customer);
    void updateCustumer(Customer customer);
    Customer searchId(String id);
}
