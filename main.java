import CreacionClases.*;
import Ejemplos.*;
import Herencia.*;

public class main {
    public static void main(String[] args) {
        // 1. Creacion de Clases
        //Creacion de objeto -> Instancia de clase.
        //Clase objeto = new clase;
        Moto moto1 = new Moto();
        moto1.marca = "Ducati";
        System.out.println(moto1.marca);

        //Ejemplos
        Smartphone cel1 = new Smartphone("Black", "Android");
        cel1.makeCall();
        System.out.println(cel1.getBattery());

        Car car1 = new Car("Mazda", "Black", 280);
        car1.travel();

        //2. Herencia
        Hijo hijo1 = new Hijo("Sebastian", "18", "M", "A-");
        hijo1.hello();
        System.out.println(hijo1.getName());
        System.out.println(hijo1.getAge());
    }
    
}