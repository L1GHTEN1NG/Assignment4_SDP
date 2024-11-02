//Создаем класс данных о погоде
public class WeatherData {
    //также станцию погоды
    private WeatherStation station;

    //конструктор класса
    public WeatherData(WeatherStation station) {
        this.station = station;
    }

    //взаимствуем метод добавления дисплея
    public void addDisplay(WeatherDisplay display) {
        station.registerDisplay(display);
    }

    //еще и метод удаления
    public void removeDisplay(WeatherDisplay display) {
        station.removeDisplay(display);
    }

    //обновляем погоду и сохраняем на станцию
    public void updateWeather(double temperature, double humidity, double pressure) {
        station.setWeatherData(temperature, humidity, pressure);
    }
}