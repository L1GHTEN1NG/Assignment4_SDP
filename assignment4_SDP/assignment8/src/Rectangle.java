//Создаем класс для прямоугольника, который взаимствует свойства интерфейса фигуры
public class Rectangle implements Shape {
    //Обязательно для круга создаем составляющее высоты и ширины
    private double width;
    private double height;

    //конструктор класса
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //геттер для ширины
    public double getWidth() {
        return width;
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
