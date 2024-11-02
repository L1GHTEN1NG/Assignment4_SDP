//Импортируем библиотеки листов и массивов
//Для чего? чтобы определить в список погоды температуру, влажность и давление
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    //создаем новый список дисплея погоды
    private List<WeatherDisplay> displays = new ArrayList<>();
    //также отдельные составляющие: #1 температура
    private double temperature;
    //#2 влажность
    private double humidity;
    //#3 давление
    private double pressure;

    //регистрация дисплея, то есть добавление какого-либо дисплея в список
    public void registerDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    //также можно удалить со списка
    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    //конструктор класса с каждой составляющей, в конце также метод определения
    public void setWeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }

    //наш метод определения каджой составляющей, взаимствую метод интерфейса обновление
    private void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }
}
