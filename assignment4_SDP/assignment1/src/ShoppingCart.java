//Создаем класс корзины для шопинга
public class ShoppingCart {
    //Определяем стратегию оплаты
    private PaymentStrategy paymentStrategy;
    //Добавляем ощую сумму
    private double totalAmount;

    //метод добавления значения, также добавляемся и цена
    public void addItem(double price) {
        totalAmount += price;
    }

    //Сеттер для стратегии оплаты
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //метод для проверки
    public void checkout() {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method before checking out.");
            return;
        }
        paymentStrategy.processPayment(totalAmount);
    }
}
