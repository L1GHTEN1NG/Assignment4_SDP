//Создаем класс определения состояния оплаты заказа, который взаимствует свойства интерфейса состояния
public class PaidState implements State {

    //взаимствует метод оплаты
    public void payOrder(Order order) {
        System.out.println("Order has already been paid.");
    }

    //также взаимствует метод отправки и переводит к отправке
    public void shipOrder(Order order) {
        System.out.println("Order is being shipped. Moving to Shipped state.");
        order.setState(new ShippedState());
    }

    //+ метод доставки заказа
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered. It hasn't been shipped yet.");
    }

    //и его отмена, если пользователь попросит
    public void cancelOrder(Order order) {
        System.out.println("Cancelling the order. Moving to Cancelled state.");
        order.setState(new CancelledState());
    }
}
