//Создаем класс установления звука, который также взаимствует интерфейс команды
public class SetVolume implements Command {
    //Создали составляющие звука и стерео
    private Stereo stereo;
    private int previousVolume;
    private int volume;

    //конструктор класса
    public SetVolume(Stereo stereo, int volume) {
        this.stereo = stereo;
        this.volume = volume;
    }

    //позаимствованный метод выполнения, то есть получения звука и установление его
    public void execute() {
        previousVolume = stereo.getVolume(); //геттер
        stereo.setVolume(volume); //сеттер
    }

    //метод отмены, включения предыдущего звука
    public void undo() {
        stereo.setVolume(previousVolume); //сеттер
    }
}