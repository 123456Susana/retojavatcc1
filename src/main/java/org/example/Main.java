package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear un objeto de la clase Empleado

        Empleado empleado= new Empleado();

        //objeto de la clase Scanner
        Scanner lea= new Scanner(System.in);
        System.out.println("digite su identificacion");
        empleado.identificacion=lea.next();



    }
}