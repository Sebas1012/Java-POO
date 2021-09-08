package Abstracta;

/*Para usar una clase abstracta solo debemos heredarla como se haria normalmente, teniendo en cuenta que si la clase abstracta
tiene metodos abstractos, es decir, sin cuerpo, deben implementarse o si no dara error. */

public class Perro extends Animal{

    public Perro(){
        setEspecie("Perro");
    }

    public void moverse() {
        System.out.println("Me muevo a 4 patas");    
    }
}
