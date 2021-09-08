package Herencia;

/*Para heredar de otra clase solo basta con usar la palabra reservada extends junto al nombre de la clase que vamos a heredar,
de este modo ya podremos acceder a los metodos y atributos de la clase heredada. */

public class Hijo extends Base {
    private String gender;
    private String RH;

    public Hijo(String name, String age, String gender, String RH){
        /*Es importante saber que cuando los atributos que se heredan estan privados se debe hacer uso de setters para poder modificar
        su estado de lo contrario se usa el metodo super(atributo1, atrubuto2, etc) para cambiar sus valores.*/
        setName(name);
        setAge(age);

        this.gender = gender;
        this.RH = RH;
    }

    public String getGender() {
        return gender;
    }

    public String getRH() {
        return RH;
    }

}
