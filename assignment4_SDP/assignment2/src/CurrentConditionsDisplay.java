//Создаем класс, который отабражает текущие условия погоды и взаимствует свойства интерфейса
public class CurrentConditionsDisplay implements WeatherDisplay {

    //Также он взаимствует метод обновления с аргументами и выводит текущие показатели
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current conditions of weather: Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + ".");
    }
}
