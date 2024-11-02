//Создаем класс, который отображает прогнозы и взаимствует свойства интерфейса также
public class ForecastDisplay implements WeatherDisplay {

    //опять же взаимствуем метод обновления
    public void update(double temperature, double humidity, double pressure) {
        //составляющая прогноза
        String forecast;

        //проверяем давление и определяем наш прогноз
        if (pressure > 1000) {
            forecast = "Weather is likely to be clear.";
        } else {
            forecast = "It might rain soon.";
        }

        //а потом выводим его
        System.out.println("Our Forecast: " + forecast);
    }
}
