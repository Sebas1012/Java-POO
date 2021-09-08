package Herencia;

public class Base {
    private String name;
    private String age;
    public int ejemplo;


    public void hello() {
        System.out.println("Hello World!");
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
