import CreacionClases.*;
import Ejemplos.*;

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
    }
    
}