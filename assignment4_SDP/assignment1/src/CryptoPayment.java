//Последний платеж через крипту, который также взаимствует интерфейс стратегии
public class CryptoPayment implements PaymentStrategy {
    //Крипта проходит через адрес кошелька
    private String adressOfWallet;

    //конструктор класса
    public CryptoPayment(String adressOfWallet) {
        this.adressOfWallet = adressOfWallet;
    }

    //взаимствуем метод
    //через адрес кошелька проходит процесс платежа и сумма
    public void processPayment(double amount) {
        System.out.println("Crypto payment by address: " +  adressOfWallet + " processed payment. Take " + amount + " dollars.");
    }
}
