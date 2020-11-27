package lk.ijse.dep.pos.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Customer implements SuperEntity {
    @Id
    private String id;
    private String name;
    private String address;

    //BiDirectional karoth pamani

//    @OneToMany(mappedBy = "customer", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE})
//
//    private List<Order> orders = new ArrayList<>();
//
//    public List<Order> getOrders() {
//        return orders;
//    }
//
//    public void addOrders(Order order) {
//        order.setCustomer(this);
//        getOrders().add(order);
//    }
//
//    public void removeOrder(Order order) {
//        if (order.getCustomer() != this) {
//            new RuntimeException("Invalid order ");
//        }
//        order.setCustomer(null);
//        this.getOrders().remove(order);
//    }
}
