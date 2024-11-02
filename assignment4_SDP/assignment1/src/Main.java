//Создаем и оформляем класс мэйн для проверки функционала
public class Main {
    public static void main(String[] args) {
        //Создаем новую корзину для шопинга
        ShoppingCart cart = new ShoppingCart();

        //Добавляем новые элементы с ценой в корзину
        cart.addItem(100.0);
        cart.addItem(55.5);

        //Оплата через кредитную карту: номер, дата, сививи
        cart.setPaymentStrategy(new CreditCardPayment("4564 7898 3220 5465", "12/26", "343"));
        cart.checkout(); //проверка

        System.out.println();

        // Изменяем стратегию оплаты на криптовалюту через адрес кошелька
        cart.setPaymentStrategy(new CryptoPayment("4698FGC00007524KZ"));
        cart.checkout(); //проверка
    }
}
