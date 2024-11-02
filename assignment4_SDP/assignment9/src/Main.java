//Мэйн класс для проверки функционала
public class Main {
    public static void main(String[] args) {
        //Создают новую систему отчетов
        ReportingSystem reportingSystem = new ReportingSystem();

        //под каждый вид вывода отчета создаем свою составляющую
        System.out.println("Generating PDF Report:");
        ReportGenerator pdfReport = new PDFReportGenerator(); //пдф
        reportingSystem.generateReport(pdfReport);

        System.out.println("Generating HTML Report:");
        ReportGenerator htmlReport = new HTMLReportGenerator(); //хтмл
        reportingSystem.generateReport(htmlReport);

        System.out.println("Generating Plain Text Report:");
        ReportGenerator plainTextReport = new PlainTextReportGenerator(); //стандартный текст
        reportingSystem.generateReport(plainTextReport);
    }
}
