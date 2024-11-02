//Создаем класс пульта контроля каждой составляющей
public class RemoteControl {
    //берем команды включения, выключения, отмены
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    //создаем новые команды через слоты
    public RemoteControl(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
    }

    //сеттер для команд
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    //кнопка включения
    public void pressOnButton(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    //кнопка выключения
    public void pressOffButton(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    //кнопка отмены команды
    public void pressUndoButton() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}