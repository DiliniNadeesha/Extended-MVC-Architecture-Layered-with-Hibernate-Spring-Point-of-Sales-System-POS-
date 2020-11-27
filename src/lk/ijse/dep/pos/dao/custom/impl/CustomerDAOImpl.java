package lk.ijse.dep.pos.dao.custom.impl;

import lk.ijse.dep.pos.dao.CrudDAOImpl;
import lk.ijse.dep.pos.dao.custom.CustomerDAO;
import lk.ijse.dep.pos.entity.Customer;
import org.springframework.stereotype.Component;

//CrudDAOImpl<Customer, String> = Parameter Type
@Component
public class CustomerDAOImpl extends CrudDAOImpl<Customer, String> implements CustomerDAO {

//    private Session session;
//
//    @Override
    //Interface through injection (setSession method eka enne super DAO gen)
//    public void setSession(Session session) {
//        this.session = session;
//    }

    @Override
    public String getLastCustomerId() throws Exception {
        return (String) session.createNativeQuery("SELECT id FROM customer ORDER BY id DESC LIMIT 1").uniqueResult();
    }

//    @Override
//    public List<Customer> findAll() throws Exception {
//        return session.createQuery("FROM lk.ijse.dep.pos.entity.Customer", Customer.class).list();
//    }
//
//    @Override
//    public Customer find(String key) throws Exception {
//        //get or find 2ma use kala haka
//        //return session.find(Customer.class, key);
//        return session.get(Customer.class, key);
//    }
//
//    @Override
//    public void save(Customer customer) throws Exception {
//        session.save(customer);
//    }
//
//    @Override
//    public void update(Customer customer) throws Exception {
//         session.update(customer);
//    }
//
//    @Override
//    public void delete(String key) throws Exception {
//        session.delete(session.load(Customer.class, key));
//    }
}
