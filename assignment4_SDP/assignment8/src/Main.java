//Класс Мэйн для определения функционала
public class Main {
    public static void main(String[] args) {
        //Новое составляющее рисунка
        Drawing drawing = new Drawing();

        //добавляем каждую фигуру в наш рисунок с аргументами под каждую
        drawing.addShape(new Circle(5.0));
        drawing.addShape(new Rectangle(4.0, 6.0));
        drawing.addShape(new Triangle(3.0, 7.0));

        //вычисляем площади каждой фигуры
        System.out.println("Calculating areas of shapes in the drawing:");
        drawing.calculateAreas();
    }
}
