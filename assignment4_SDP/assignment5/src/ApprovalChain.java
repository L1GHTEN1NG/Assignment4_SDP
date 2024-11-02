//Создаем класс цепочки утверждений
public class ApprovalChain {
    //составляющее первого утвердителя
    private Approver firstApprover;

    //конструктор класса
    public ApprovalChain() {
        //создаются каждые составляющие работников
        TeamLead teamLead = new TeamLead();
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();

        //используем сеттеры для каджого работника
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        //устанавливаем первого утвердителя/работника
        firstApprover = teamLead;
    }

    //также взаимстенный метод обработки этого запроса
    public void processRequest(ExpenseRequest request) {
        firstApprover.handleRequest(request);
    }
}
