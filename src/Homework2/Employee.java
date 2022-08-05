package Homework2;

public class Employee {
    private int countBrokenProd;
    private Storage storage;

    public Employee(Storage storage) {
        this.storage = storage;
    }

    public int getCountBrokenProd() {
        return countBrokenProd;
    }

    public void setCountBrokenProd(int countBrokenProd) {
        this.countBrokenProd = countBrokenProd;
    }
    public void brokenVodka() {
        if (storage.getProductCount() > 0) {
            storage.setProductCount(storage.getProductCount() - 1);
            countBrokenProd = countBrokenProd + 1;
            System.out.println("Ура, я испортил водку!");
        }
    }
}
