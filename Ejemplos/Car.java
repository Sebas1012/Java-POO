package Ejemplos;

public class Car {
    private String brand;
    private String color;
    private int km;

    //Constructor con parametros.
    public Car(String brand, String color, int km){
        this.brand = brand;
        this.color = color;
        this.km = km;
    }

    public void travel(){
        this.km += 10;

        if(this.km >= 300){
            System.out.println("It's time for a maintenance");
        }
            System.out.println("Travel 10km");
        
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }
}
