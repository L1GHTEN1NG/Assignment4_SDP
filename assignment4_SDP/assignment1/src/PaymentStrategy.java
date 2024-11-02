//Создаем интерфейс стратегии платежа, также добавляем туда метод процесс платежа
public interface PaymentStrategy {
    void processPayment(double amount);
}