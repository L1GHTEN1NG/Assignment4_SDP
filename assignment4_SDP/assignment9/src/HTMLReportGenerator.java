//Создали класс для отчета через хтмл, который взаимствует свойства класса генератора репортов
public class HTMLReportGenerator extends ReportGenerator {

    //взаимствует метод оглавления
    protected void formatHeader() {
        System.out.println("<html><head><title>Report Title</title></head>");
        System.out.println("<body><h1>HTML Header: Report Title</h1>");
    }

    //взаимствует метод тела
    protected void formatBody() {
        System.out.println("<p>HTML Body: Report Content</p>");
    }

    //взаимствует метод концовки
    protected void formatFooter() {
        System.out.println("<footer>HTML Footer: End of Report</footer></body></html>");
    }
}
