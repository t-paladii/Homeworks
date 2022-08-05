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
            try {
                if (isInjured) {
                    throw new FlyException("Уточка ранена");
                } else {
                    System.out.println("Уточка летит");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

}

