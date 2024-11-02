//Класс включения телевизора, который взаимствует класс команды
public class TurnTVOn implements Command {
    //создали составляющее тв
    private TV tv;

    //его кнструктор
    public TurnTVOn(TV tv) {
        this.tv = tv;
    }

    //взаимствуем метод выполнения, а именно включения тв
    public void execute() {
        tv.on();
    }

    //также метод отмены, то есть выключения
    public void undo() {
        tv.off();
    }
}