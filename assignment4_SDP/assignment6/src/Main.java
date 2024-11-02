//Класс мэйн для просмотра функционала
public class Main {
    public static void main(String[] args) {
        //создали новую комнату чата
        ChatMediator chatRoom = new ChatRoom();

        //создали разных участников/пользователей
        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new PremiumUser(chatRoom, "Bob");
        User user3 = new RegularUser(chatRoom, "Charlie");
        User user4 = new PremiumUser(chatRoom, "Diana");

        //добавили их в комнату
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        //также отправили сообщения
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi, Alice!");
        user3.sendMessage("Good morning!");
        user4.sendMessage("How is everyone doing?");
    }
}
