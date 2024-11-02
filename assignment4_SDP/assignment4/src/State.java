//Создаем интерфейс для определения состояния заказов
public interface State {
    //добавляем туда методы оплаты, отправки, доставки и отмены
    void payOrder(Order order);
    void shipOrder(Order order);
    void deliverOrder(Order order);
    void cancelOrder(Order order);
}