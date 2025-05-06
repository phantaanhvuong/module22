package casestudy.repository.customer;

import casestudy.entity.Customer;
import casestudy.entity.Employee;
import casestudy.util.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private final String CUSTOMER_FILE ="src/casestudy/data/customer.csv";
    private final boolean APPEND = true;
    private final boolean NO_APPEND = false;
    public static List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadWriteFile.readFile(CUSTOMER_FILE);
        String[] arr;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            Customer customer = new Customer(arr[0],arr[1],arr[2],
                    arr[3],arr[4],arr[5],
                    arr[6],arr[7],arr[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addCustumer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInToFileCustomer());
        ReadWriteFile.writeFile(CUSTOMER_FILE,stringList,APPEND);
    }

    @Override
    public void updateCustumer(Customer customer) {
        List<Customer> customerList = findAllCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMa().equals(customer.getMa())){
                customerList.set(i,customer);
                break;
            }
            List<String> stringList = new ArrayList<>();
            for (Customer c : customerList){
                stringList.add(c.getInToFileCustomer());
            }
            ReadWriteFile.writeFile(CUSTOMER_FILE,stringList,NO_APPEND);
        }
    }

    @Override
    public Customer searchId(String id) {
        List<Customer> customerList = findAllCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if ((customerList.get(i).getMa()).equals(id)){
                return customerList.get(i);
            }
        }
        return null;
    }
}
