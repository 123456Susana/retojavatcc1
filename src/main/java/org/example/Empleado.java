package org.example;

public class Empleado {

    //ATRIBUTOS
    String identificacion;
    String nombre;
    int salario;
    int numeroVentasMensuales;
    int valorComision;
    double deducciones;

    //CONSTRUCTOR

    public Empleado() {
    }

    public Empleado(String identificacion, String nombre, int salario, int numeroVentasMensuales, int valorComision, double deducciones) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.salario = salario;
        this.numeroVentasMensuales = numeroVentasMensuales;
        this.valorComision = valorComision;
        this.deducciones = deducciones;
    }

    //METODOS
    //ponemos public double porque nos va a devolver un valor salario decimal

    public double calcularSalario(){

        int salarioVentas= this.numeroVentasMensuales *  this.valorComision;
        int salarioTotal= salarioVentas + this.salario;
        double salarioDeducido= salarioTotal * this.deducciones;
        double salarioNeto= salarioTotal - salarioDeducido;

        return salarioNeto;
    }
}
