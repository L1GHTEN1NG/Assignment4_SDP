//Создаем интерфейс для посредника чата
public interface ChatMediator {
    //у него есть методы добавления участника и отправления сообщений
    void sendMessage(String message, User user);
    void addUser(User user);
}