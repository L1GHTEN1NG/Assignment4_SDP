//Создаем платеж с помощью кредитной карты, который взаимствует свойства интерфейса стратегии этого платежа
public class CreditCardPayment implements PaymentStrategy {
    //Номер карты
    private String numberOfCard;
    //Срок действия
    private String expirationDate;
    //Сививи
    private String cvv;

    //конструктор класса
    public CreditCardPayment(String numberOfCard, String expirationDate, String cvv) {
        this.numberOfCard = numberOfCard;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    //метод, который он взаимствует у интерфейса
    //идет процесс снимания денег
    public void processPayment(double amount) {
        System.out.println("Credit card: " + numberOfCard + " processed payment. Take " + amount + " dollars.");
    }
}
