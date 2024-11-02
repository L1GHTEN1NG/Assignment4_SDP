//Мэйн класс для проверки функционала
public class Main {
    public static void main(String[] args) {
        //Создаем составляющие станции и данных погоды
        WeatherStation station = new WeatherStation();
        WeatherData weatherData = new WeatherData(station);

        //Также каждый отдельный дисплей
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        //В данные добавляем дисплей прогнозов, статистики и текущих дисплеев
        weatherData.addDisplay(currentDisplay);
        weatherData.addDisplay(statisticsDisplay);
        weatherData.addDisplay(forecastDisplay);

        //обновляем данные дисплеев
        System.out.println("Updating weather to 25°C, 65% humidity, 1010 hPa:");
        weatherData.updateWeather(25, 65, 1010);

        System.out.println("\nUpdating weather to 22°C, 70% humidity, 990 hPa:");
        weatherData.updateWeather(22, 70, 990);

        System.out.println("\nUpdating weather to 27°C, 60% humidity, 1005 hPa:");
        weatherData.updateWeather(27, 60, 1005);
    }
}
