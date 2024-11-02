//Создаем класс утвердителя
public abstract class Approver {
    //сотавляющее следущего утвердителя
    protected Approver nextApprover;

    //сеттер класса для следущего утвердителя
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    //также метод обработки запроса
    public abstract void handleRequest(ExpenseRequest request);
}
