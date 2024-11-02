//Теперь уже идем по каждому класса, этот лидер команды который взаимствует свойства у утвердителя
public class TeamLead extends Approver {

    //взаимствует метод обработки под себя
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 500) {
            System.out.println("TeamLead approved the expense request of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
