//Создаем общий интерфейс для дисплея погоды
public interface WeatherDisplay {
    //туда добавляем метод обновления температуры, влажности, давления
    void update(double temperature, double humidity, double pressure);
}