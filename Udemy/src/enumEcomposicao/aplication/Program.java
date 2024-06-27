package enumEcomposicao.aplication;

import java.util.Date;

import enumEcomposicao.entities.Order;
import enumEcomposicao.entitiesEnums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");

        System.out.println(os1);
        System.out.println(os2);

    }
}
