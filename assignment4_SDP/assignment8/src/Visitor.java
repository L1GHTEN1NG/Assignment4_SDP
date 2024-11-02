//Создали интерфейс посетителя для каджой отдельной фигуры
public interface Visitor {
    void visit(Circle circle); //круг
    void visit(Rectangle rectangle); //прямоугольник
    void visit(Triangle triangle); //треугольник
}