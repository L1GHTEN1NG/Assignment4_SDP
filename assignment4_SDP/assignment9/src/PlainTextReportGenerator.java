//Создали класс для отчета через простой текст, который взаимствует свойства класса генератора репортов
public class PlainTextReportGenerator extends ReportGenerator {

    //взаимствует метод оглавления
    protected void formatHeader() {
        System.out.println("Plain Text Header: Report Title");
    }

    //взаимствует метод тела
    protected void formatBody() {
        System.out.println("Plain Text Body: Report Content");
    }

    //взаимствует метод концовки
    protected void formatFooter() {
        System.out.println("Plain Text Footer: End of Report");
    }
}
