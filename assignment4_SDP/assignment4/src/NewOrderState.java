//Создаем класс определения состояния нового заказа, который взаимствует свойства интерфейса состояния
public class NewOrderState implements State {

    //взаимствует метод оплаты и переводит к оплате
    public void payOrder(Order order) {
        System.out.println("Order has been paid. Moving to Paid state.");
        order.setState(new PaidState()); //сеттер
    }

    //также взаимствует метод отправки
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped. Payment required.");
    }

    //+ метод доставки заказа
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered. It hasn't been shipped yet.");
    }

    //и его отмена, если пользователь попросит
    public void cancelOrder(Order order) {
        System.out.println("Order has been cancelled.");
        order.setState(new CancelledState());
    }
}
