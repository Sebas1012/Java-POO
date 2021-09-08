package Ejemplos;

public class Smartphone {
    private String color;
    private String os;
    private int battery;

    public Smartphone(String color, String os){
        this.color = color;
        this.os = os;
        this.battery = 100;
    }

    public void makeCall() {
        if(this.battery == 0){
            throw new RuntimeException("Low Battery");
        }else{
            this.battery -= 10;
            System.out.println("You make a call!");
        }
    }

    public int getBattery() {
        return battery;
    }

    public void recharge(){
        this.battery = 100;
    }

}
