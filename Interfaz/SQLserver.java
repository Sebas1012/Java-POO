package Interfaz;

public class SQLserver implements Conexion{
    public void conexion(){
        System.out.println("Conectandose a SQLserver");
    }

    public void insertar(){
        System.out.println("Insertando un dato en SQLserver " + code);
    }

    public void eliminar(){
        System.out.println("Eliminando un dato en SQLserver");
    }

    public void modificar(){
        System.out.println("Modificando un dato en SQLserver");
    }
}
