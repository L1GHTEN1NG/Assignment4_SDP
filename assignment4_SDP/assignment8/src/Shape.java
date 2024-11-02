//Создаем интерфейс фигуры
public interface Shape {
    //у которого есть единственный метод принятия с посетителем
    void accept(Visitor visitor);
}
