//Теперь уже идем по каждому класса, этот генеральный директор команды который взаимствует свойства у утвердителя
public class CEO extends Approver {

    //взаимствует метод обработки под себя, он контролирует всю сумму
    public void handleRequest(ExpenseRequest request) {
        System.out.println("CEO approved the expense request of $" + request.getAmount() + " for " + request.getPurpose());
    }
}
