//Мэйн класс для разбора функционала
public class Main {
    public static void main(String[] args) {
        //Создаем новую цепоцку отработчиков
        ApprovalChain approvalChain = new ApprovalChain();

        //Запросы под каждую заявку с стоймостью и причиной
        ExpenseRequest request1 = new ExpenseRequest(300, "Team Outing");
        ExpenseRequest request2 = new ExpenseRequest(1500, "New Office Supplies");
        ExpenseRequest request3 = new ExpenseRequest(4500, "Conference Sponsorship");
        ExpenseRequest request4 = new ExpenseRequest(10000, "New Equipment");

        //вывод запросов
        System.out.println("Processing requests:");
        approvalChain.processRequest(request1);
        approvalChain.processRequest(request2);
        approvalChain.processRequest(request3);
        approvalChain.processRequest(request4);
    }
}
