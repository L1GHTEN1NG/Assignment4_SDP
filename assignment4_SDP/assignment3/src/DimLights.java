//Создали класс для света, который также взаимствует свойства интерфейса
public class DimLights implements Command {
    //сотавляющее света, а также предыдущих левелов света
    private Light light;
    private int previousLevel;
    private int level;

    //конструктор класса
    public DimLights(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    //метод выполнения также как и со звуком
    public void execute() {
        previousLevel = light.getLevel(); //геттер
        light.dim(level); //сеттер
    }

    //метод отмены, включаем предыдущий свет
    public void undo() {
        light.dim(previousLevel); //сеттер
    }
}
