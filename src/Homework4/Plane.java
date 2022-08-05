package Homework4;

import java.sql.SQLOutput;

public class Plane implements Flying {
    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        try {
            if (countPassengers < 0) {
                throw new FlyException("Пассажиров меньше 0, не полетим");
            } else {
           System.out.println("Самолет полетел");
          }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
