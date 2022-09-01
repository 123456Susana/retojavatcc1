package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear un objeto de la clase Empleado

        Empleado empleado= new Empleado();

        //objeto de la clase Scanner
        Scanner lea= new Scanner(System.in);
        System.out.println("digite su identificacion: ");
        empleado.identificacion=lea.nextLine();
        System.out.println("digite su nombre: ");
        empleado.nombre=lea.nextLine();
        System.out.println("digite su salario mensual: ");
        empleado.salario=lea.nextInt();
        System.out.println("digite su numero de ventas mensuales: ");
        empleado.numeroVentasMensuales=lea.nextInt();
        System.out.println("digite su valor de comision: ");
        empleado.valorComision=lea.nextInt();
        //double es con , (coma)
        System.out.println("digite el valor de sus deducciones: ");
        empleado.deducciones=lea.nextDouble();

        //creo un objeto de la clase Empleado
        //Empleado empleado= new Empleado("1036676319","Susana",3500000,
                //15,50000,0.5);
        //System.out.println("Identificacion: "+empleado.identificacion);
        //System.out.println("Nombre empleado: "+empleado.nombre);



    }
}