//Теперь уже идем по каждому класса, этот мэнеджер который взаимствует свойства у утвердителя
public class Manager extends Approver {

    //взаимствует метод обработки под себя
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 2000) {
            System.out.println("Manager approved the expense request of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
