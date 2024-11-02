//Класс для стерео
public class Stereo {
    //Составляющее звука
    private int volume;

    //включение стерео
    public void on() {
        System.out.println("Stereo is ON");
    }

    //выключение стерео
    public void off() {
        System.out.println("Stereo is OFF");
    }

    //сеттер звука
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo volume set to " + volume);
    }

    //геттер звука
    public int getVolume() {
        return volume;
    }
}
