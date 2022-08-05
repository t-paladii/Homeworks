package Homework4;

public class Duck implements Flying{

//    @Override
//    public void fly() {
//        System.out.println("Уточка летит");
//    }

    private boolean isInjured;
    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }
    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Уточка ранена");
            }
        System.out.println("Уточка летит");
        }
}

