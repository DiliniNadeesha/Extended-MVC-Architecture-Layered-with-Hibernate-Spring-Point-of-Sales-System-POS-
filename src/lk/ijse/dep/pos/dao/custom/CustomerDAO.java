package lk.ijse.dep.pos.dao.custom;

import lk.ijse.dep.pos.dao.CrudDAO;
import lk.ijse.dep.pos.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer,String> {

    // These are abstract methods

    //These 5 CRUD Operations are common for the other DAO's, Because

//    public List<Customer> findAllCustomers();
//
//    public Customer findCustomer(String customerId);
//
//    public boolean saveCustomer(Customer customer);
//
//    public boolean updateCustomer(Customer customer);
//
//    public boolean deleteCustomer(String customerId);

    String getLastCustomerId() throws Exception;

}
