package Herencia;

/*Para heredar de otra clase solo basta con usar la palabra reservada extends junto al nombre de la clase que vamos a heredar,
de este modo ya podremos acceder a los metodos y atributos de la clase heredada. */

public class Hijo extends Base {
    private String gender;
    private String RH;

    public Hijo(String name, String age, String gender, String RH){
        /*Para poder asignares valores a los atributos heredados es necesario usar el metodo super(), pasandole como parametro los atributos
        a los que cambiaremos de valor. Es importante tener en cuenta que para poder usar super() debe estar creado un metodo constructor en
        la clase base que inicialice los atributos */
        super(name, age);

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
