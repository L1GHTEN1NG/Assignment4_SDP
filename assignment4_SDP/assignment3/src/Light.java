//Отдельный класс для света
public class Light {
    //Составляющее уровня света
    private int level;

    //включение света с уровнем 100
    public void on() {
        level = 100;
        System.out.println("Lights are ON at 100%");
    }

    //выключение света
    public void off() {
        level = 0;
        System.out.println("Lights are OFF");
    }

    //сеттер для уровня света
    public void dim(int level) {
        this.level = level;
        System.out.println("Lights dimmed to " + level + "%");
    }

    //геттер для уровня света
    public int getLevel() {
        return level;
    }
}
