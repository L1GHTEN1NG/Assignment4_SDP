//Класс для премиум пользователя, который также взаимствует свойства класса пользователя
public class PremiumUser extends User {

    //использования тега супер для взаимствования у суперкласса
    public PremiumUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    //его метод отправки сообщения
    public void sendMessage(String message) {
        System.out.println(name + " (PremiumUser) sends: " + message);
        mediator.sendMessage(message, this);
    }

    //а также метод возвращения сообщения
    public void receiveMessage(String message, String senderName) {
        System.out.println(name + " received from " + senderName + ": " + message);
    }
}
