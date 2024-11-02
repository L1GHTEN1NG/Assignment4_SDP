//Создаем класс, который отображает статистику дисплея погоды и взаимствует свойства интерфейса
public class StatisticsDisplay implements WeatherDisplay {
    //максимальное значение для сравнения
    private double maxTemperature = -100000000;
    //минимальное значение для сравнения
    private double minTemperature = 100000000;
    //сумма температур
    private double count = 0.0;
    //количество составляющих
    private int number = 0;

    //взаимствуем метод обновления с интерфейса
    public void update(double temperature, double humidity, double pressure) {
        //суммируем температуру и количество
        count += temperature;
        number = number + 1;

        //определяем максимальную
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        //а также минимальную
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        //выводим разницу, макс, мин
        double average = count / number;
        System.out.println("Average tempereture: " + average);
        System.out.println("Minimum tempereture: " + minTemperature);
        System.out.println("Maximum tempereture: " + maxTemperature);
    }
}
