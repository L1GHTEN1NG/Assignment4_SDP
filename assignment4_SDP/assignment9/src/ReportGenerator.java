//Создаем абстрактный класс генератора отчетов
public abstract class ReportGenerator {
    //финальный метод создания отчета
    public final void generateReport() {
        formatHeader(); //оглавление
        formatBody(); //тело
        formatFooter(); //конец
        System.out.println("Report generated successfully.");
    }

    //кадждое составляющее
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}
