package Abstracta;

/*Podriamos definir una clase abstracta como una clase muy general donde otras clases comparten metodos pero
se pueden implementar de distinta manera, un ejemplo es un animal, si hablamos de animal hablamos
de un concepto muy general, ya que hay muchos tipos de animales que, comparten caracteristicas, pero de distinta forma, un
ejemplo de eso puede ser el moverse, todos se pueden mover pero de distintas maneras, unos arrastrandose, otros a 2 patas,
otros a cuatro, otros trepando, etc 

Es importante tener en cuenta que una clase abstracta no puede instanciarse y que la misma solo puede ser usada como clase padre.*/


public abstract class Animal {
    public String especie;

    public void comer(){
        System.out.println("El " + especie + " esta comiendo.");
    }

    public void dormir(){
        System.out.println("El " + especie + " esta durmiendo.");
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public abstract void moverse();
}
