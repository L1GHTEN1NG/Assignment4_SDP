//Создаем класс для круга, который взаимствует свойства интерфейса фигуры
public class Circle implements Shape {
    //Обязательно для круга создаем составляющее радиус
    private double radius;

    //конструктор класса
    public Circle(double radius) {
        this.radius = radius;
    }

    //геттер радиуса
    public double getRadius() {
        return radius;
    }

    //метод повзаимствовали у интерфейса
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
