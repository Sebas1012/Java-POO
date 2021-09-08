package Herencia;

public class Base {
    private String name;
    private String age;

    // Construcctor que inicia atributos.
    public Base(String name, String age){
        this.name = name;
        this.age = age;
    }

    public void hello() {
        System.out.println("Hello World!");
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
