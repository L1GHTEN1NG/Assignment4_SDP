//Теперь уже идем по каждому класса, этот директор который взаимствует свойства у утвердителя
public class Director extends Approver {

    //взаимствует метод обработки под себя
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approved the expense request of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
