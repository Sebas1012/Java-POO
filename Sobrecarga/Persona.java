package Sobrecarga;

/*Podemos entender la sobrecarga de metodos como la forma que tenemos de crear varios mismos metodos pero cada uno con propiedades diferentes

Para entenderlo mejor en el ejemplo tenemos 2 mismos metodos llamados caminar pero uno de ellos no recive parametros y el otro si, tambien 
tienen cuerpo diferente, lo mismo con los constructores.

De esa manera se puede ver la sobrecarga de metodos.*/

public class Persona {
    String nombre;
    String edad;
    String cc;

    public Persona(String nombre, String edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String cc){
        this.cc = cc;
    }

    public void caminar(){
        System.out.println("Estoy caminando :v " + this.nombre);
    }

    public void caminar(String genero){
        System.out.println("Estoy caminando 2 UwU " + genero);
    }
}
