package CreacionClases;

public class Moto {
    /* Atributos -> Caracteristicas que puede tener el objeto que se crea a partir de una clase.
    Es importante tener en cuenta que los atributos en la mayoria de los casos deben estar privados(private)
    para evitar posibles errores. Tambien es importante entender que en este caso estan como publicos porque la clase principal desde donde 
    se esta llamando esta clase (main.java) esta fuera del paquete, entonces para poder acceder a esos atributos deben estar publicos, ojo,
    solo pasa eso porque estan publicos si fueran private deberiamos crear sus respectivos getters and setters*/

    public String marca;
    public String color;
    public String cilindraje;

    public String getColor() {
        return color;
    }

    /*Es importante tener en cuenta que el set se debe usar cuando no tenemos idea de cual va a ser el valor que le asignaremos al 
    atributo, de lo contrario debemos usar un metodo que lo haga.*/
    public void setColor(String color) {
        this.color = color;
    }
}
