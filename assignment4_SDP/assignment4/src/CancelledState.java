//Создаем класс определения состояния отмены заказа, который взаимствует свойства интерфейса состояния
public class CancelledState implements State {

    //взаимствует метод оплаты
    public void payOrder(Order order) {
        System.out.println("Order is cancelled. Payment not possible.");
    }

    //также взаимствует метод отправки
    public void shipOrder(Order order) {
        System.out.println("Order is cancelled. Shipping not possible.");
    }

    //+ метод доставки заказа
    public void deliverOrder(Order order) {
        System.out.println("Order is cancelled. Delivery not possible.");
    }

    //и его отмена, если пользователь попросит
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
