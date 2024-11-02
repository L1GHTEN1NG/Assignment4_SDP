//Создали интерфейс команда и методы к нему: выполнения и отмены
public interface Command {
    void execute();
    void undo();
}