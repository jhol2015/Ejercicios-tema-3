package classes;

import static objetos.Metodos.suma;

public class Calculo {
    public static void main(String[] args) {
        //Segunda parte del ejercicio
        Coche coche = new Coche(1);
        System.out.println(coche.puertas);

        //Primera parte del ejercicio
        int soma = suma(10, 20, 30);
        System.out.println(soma);
    }
}
