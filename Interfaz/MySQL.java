package Interfaz;

// Para implementar una interface primero debemos  llamarla con la palabra reservada implements + el nombre de la interface.

public class MySQL implements Conexion{

    //Luego debemos implementar los metodos que se describen en la interface, solo que esta vez sin tendran cuerpo.

    public void conexion(){
        System.out.println("Conectandose a MySQL");
    }

    public void insertar(){
        System.out.println("Insertando un dato en MySQL " + code);
        
    }

    public void eliminar(){
        System.out.println("Eliminando un dato en MySQL");
    }

    public void modificar(){
        System.out.println("Modificando un dato en MySQL");
    }
}
