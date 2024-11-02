//Создали отдельный класс для вывода площади каждой фигуры,
//который взаимствует свойства интерфейса посетителя
//чтобы под каджой его метод для фигуры реализовать площадь
public class AreaCalculator implements Visitor {

    //Этот например выводит площадь круга через его формулу
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Area of Circle: " + area);
    }

    //Этот например выводит площадь прямоугольника через его формулу
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
    }

    //Этот например выводит площадь треугольника через его формулу
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Area of Triangle: " + area);
    }
}
