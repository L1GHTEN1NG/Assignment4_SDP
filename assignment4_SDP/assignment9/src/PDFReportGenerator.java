//Создали класс для отчета через пдф, который взаимствует свойства класса генератора репортов
public class PDFReportGenerator extends ReportGenerator {

    //опять же, оглавление
    protected void formatHeader() {
        System.out.println("PDF Header: <<Report Title>>");
    }

    //тело
    protected void formatBody() {
        System.out.println("PDF Body: <<Report Content>>");
    }

    //конец
    protected void formatFooter() {
        System.out.println("PDF Footer: <<End of Report>>");
    }
}
