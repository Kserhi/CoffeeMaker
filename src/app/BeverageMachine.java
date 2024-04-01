package app;

public class BeverageMachine {
    private Beverage beverage;

    public void setBeverage(Beverage beverage){
        this.beverage=beverage;
    }

    public String make(){
        return "Your "+beverage.make()+". Enjoy :)";
    }
}
