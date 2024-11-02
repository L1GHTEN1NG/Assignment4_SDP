//Класс мэйн для проверки функционала
public class Main {
    public static void main(String[] args) {
        //Создаем новый пульт
        RemoteControl remoteControl = new RemoteControl(3);

        //Сотавляющие тв, звука и света
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        //Команды для каждой составляющей, включения и выключения
        Command tvOn = new TurnTVOn(tv);
        Command setVolume = new SetVolume(stereo, 10);
        Command dimLights = new DimLights(light, 50);

        //выполнение команд
        System.out.println("Pressing TV On:");
        remoteControl.pressOnButton(0);

        System.out.println("\nUndoing Stereo Volume:");
        remoteControl.pressUndoButton();

        System.out.println("\nPressing Dim Lights:");
        remoteControl.pressOnButton(2);
    }
}
