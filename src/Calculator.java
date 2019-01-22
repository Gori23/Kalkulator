public class Calculator {
    private IAction iAction;

    public Calculator(IAction action){
        this.iAction=action;
    }
    public double ExecuteCalculation(double a, double b){
        return this.iAction.doSomethig(a,b);
    }
}
