package Interfaz;

/*Una interface en java es un contrato donde decimos a una clase que metodos debe implementar a la hora de crearse, esa implementacion
es de caracter obligatoria si se quiere usar una interface. Tener encuenta que esos metodos no tienen cuerpo, es decir, codigo, la interface 
solo se encarga de decirle a la clase que metodos obligatorios debe usar, ya en la clase es donde se deben implementar con su respectivo 
codigo.

En formato mas tecnico una interface es una especie de contrato o descripción que una clase se “compromete” a tener al implementar(usar) 
dicha interfaz. Este contrato está dado por una colección de métodos abstractos(sin definir su funcionalidad) los cuáles deben ser 
implementados en la clase que se adhiere a la interfaz.

Tener en cuenta que en una interface tambien se puden definir constantes que podremos usar en la clase que implemente la interface.*/


public interface Conexion {

    public int code = 200;
    
    public void conexion();
    public void insertar();
    public void eliminar();
    public void modificar();
    
}