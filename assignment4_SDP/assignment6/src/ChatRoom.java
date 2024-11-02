//Импортируем библиотеки для списков и массивов
import java.util.ArrayList;
import java.util.List;

//Создаем класс комнаты чата, который взаимствует методы интерфейса
public class ChatRoom implements ChatMediator {
    //Создается список участников
    private List<User> users;

    //конструктор класса
    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    //взаимственный метод добавления участника
    public void addUser(User user) {
        users.add(user);
    }

    //также метод вывода сообщений
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) { //отправителю не отправляет сообщение
                user.receiveMessage(message, sender.getName());
            }
        }
    }
}
