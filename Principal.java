import CreacionClases.*;
import Ejemplos.*;
import Herencia.*;
import Interfaz.*;
import Abstracta.*;
import Sobrecarga.*;

public class Principal {
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

        //3. Interfaces
        MySQL db1 = new MySQL();
        SQLserver db2 = new SQLserver();

        db1.conexion();
        db1.insertar();
        db2.conexion();
        db2.insertar();

        //4. Clases abstractas
        Perro scott = new Perro();
        scott.comer();
        scott.dormir();
        scott.moverse();
        Pez delfin = new Pez();
        delfin.comer();
        delfin.dormir();
        delfin.moverse();

        //5. Sobrecarga de metodos
        Persona persona1 = new Persona("1234");
        Persona persona2 = new Persona("Oscar", "18");
        persona1.caminar();;
        persona2.caminar("M");
    }
    
}