//Создаем класс для треугольника, который взаимствует свойства интерфейса фигуры
public class Triangle implements Shape {
    //Обязательно для круга создаем составляющее высоты и начала
    private double base;
    private double height;

    //конструктор класса
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //геттер для начала
    public double getBase() {
        return base;
    }

    //геттер для высоты
    public double getHeight() {
        return height;
    }

    //метод повзаимствовали у интерфейса
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
