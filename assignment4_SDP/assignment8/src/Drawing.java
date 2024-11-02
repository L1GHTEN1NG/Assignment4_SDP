//Импортируем библиотеки списков и массивов для реализации списка фигур
import java.util.ArrayList;
import java.util.List;

//Создали класс рисования чтобы срисовать площадь каждой фигуры
public class Drawing {
    //Создали список фигур
    private List<Shape> shapes = new ArrayList<>();

    //метод добавления фигуры туда
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    //это уже метод вычисления фигуры под каждую фигуру
    public void calculateAreas() {
        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }
    }
}
