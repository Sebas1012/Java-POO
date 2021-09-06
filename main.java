import CreacionClases.Clases;
import CreacionClases.Moto;

public class main {
    public static void main(String[] args) {
        // 1. Creacion de Clases
        //Creacion de objeto -> Instancia de clase.
        Moto moto1 = new Moto();

        moto1.marca = "Ducati";

        System.out.println(moto1.marca);
    }
    
}