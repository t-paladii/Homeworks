public class RatPet {
    private String color;
    private int age;

    public RatPet (String ratColor, int ratAge) {
        this.color = ratColor;
        this.age = ratAge;
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return "This rat is " + this.color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
}
