//Создаем класс определения состояния отправки заказа, который взаимствует свойства интерфейса состояния
public class ShippedState implements State {

    //взаимствует метод оплаты
    public void payOrder(Order order) {
        System.out.println("Order has already been paid and shipped.");
    }

    //также взаимствует метод отправки
    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    //+ метод доставки заказа и переводит к доставке
    public void deliverOrder(Order order) {
        System.out.println("Order has been delivered. Moving to Delivered state.");
        order.setState(new DeliveredState());
    }

    //и его отмена, если пользователь попросит
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled. It has already been shipped.");
    }
}
