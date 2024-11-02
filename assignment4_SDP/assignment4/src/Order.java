//Создаем класс заказа
public class Order {
    //составляющее состояния заказа
    private State state;

    //конструктор класса
    public Order() {
        state = new NewOrderState(); //берем метод для создания нового состояния
    }

    //сеттер для состояния
    public void setState(State state) {
        this.state = state;
    }

    //метод оплаты
    public void payOrder() {
        state.payOrder(this);
    }

    //метод отправки
    public void shipOrder() {
        state.shipOrder(this);
    }

    //метод доставки
    public void deliverOrder() {
        state.deliverOrder(this);
    }

    //метод отмены
    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
