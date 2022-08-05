package Homework2;

import com.sun.source.tree.BreakTree;

public class CatPet {
    public static String calling = " kis kis kis";
    private String name;
    private double weight;

    public CatPet (String catName, double catWeight) {
        this.name = catName;
        this.weight = catWeight;
    }
    public String getCalling () {
        return this.name + calling;
    }

    public double getWeight () {
        return this.weight;
    }

    public void setWeight (double newWeight) { this.weight = newWeight;}

}
