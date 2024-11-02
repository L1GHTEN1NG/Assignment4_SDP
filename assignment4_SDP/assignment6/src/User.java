//Создали абстрактный класс пользователя
public abstract class User {
    //также составляющие посредника чата и имени
    protected ChatMediator mediator;
    protected String name;

    //конструктор класса
    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    //геттер имени
    public String getName() {
        return name;
    }

    //методы отправления сообщения и возвращения их
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message, String senderName);
}
