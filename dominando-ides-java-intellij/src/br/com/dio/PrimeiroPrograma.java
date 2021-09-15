package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        //System.out.println("Hello World! \nI'm Fernanda and you'll know me :)");
        Gato g = new Gato("Fernanda", "Rosa", 22);
        System.out.println(g.toString());

    }

}
