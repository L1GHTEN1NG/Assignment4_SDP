//Создаем класс определения состояния доставки заказа, который взаимствует свойства интерфейса состояния
public class DeliveredState implements State {

    //взаимствует метод оплаты
    public void payOrder(Order order) {
        System.out.println("Order has already been delivered. No further payment possible.");
    }

    //также взаимствует метод отправки
    public void shipOrder(Order order) {
        System.out.println("Order has already been delivered.");
    }

    //+ метод доставки заказа
    public void deliverOrder(Order order) {
        System.out.println("Order is already delivered.");
    }

    //и его отмена, если пользователь попросит
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled. It has already been delivered.");
    }
}
