package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("IntA = "+ intA + " - intB = " + intB);

        intA = 2;
        System.out.println("IntA = "+ intA + " - intB = " + intB);

//        ------------------

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA = "+ objA + " - objB = " + objB);

        objA.setNum(2);
        System.out.println("objA = "+ objA + " - objB = " + objB);

    }

}
