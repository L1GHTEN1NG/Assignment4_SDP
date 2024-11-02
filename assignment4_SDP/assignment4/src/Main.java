//Мэйн класс для проверки функционала
public class Main {
    public static void main(String[] args) {
        //создаем новый заказ
        Order order = new Order();

        //оплачиваем
        System.out.println("Current state: New");
        order.payOrder();

        //отправляем
        System.out.println("Current state: Paid");
        order.shipOrder();

        //доставляем
        System.out.println("Current state: Shipped");
        order.deliverOrder();

        //отменяем
        System.out.println("Trying to cancel after delivery:");
        order.cancelOrder();
    }
}
