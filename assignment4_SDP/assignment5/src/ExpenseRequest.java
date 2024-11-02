//Создаем класс заявки на расходы
public class ExpenseRequest {
    //в котором составляющие стоймости и причины
    private double amount;
    private String purpose;

    //конструктор класса
    public ExpenseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    //геттер стоймости
    public double getAmount() {
        return amount;
    }

    //геттер причины
    public String getPurpose() {
        return purpose;
    }
}
