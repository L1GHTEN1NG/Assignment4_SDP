//Создаем платеж с помощью пэйпал, который также взаимствует интерфейс стратегии
public class PayPalPayment implements PaymentStrategy {
    //как мы знаем, пэйпал работает через эмейл
    private String email;

    //конструктор класса
    public PayPalPayment(String email) {
        this.email = email;
    }

    //также взаимствующий метод
    //проходит платеж через эмайл с данной суммой
    public void processPayment(double amount) {
        System.out.println("Paypal by email: " + email + " processed payment. Take " + amount + " dollars.");
    }
}