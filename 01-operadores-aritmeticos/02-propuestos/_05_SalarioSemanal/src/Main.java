/*
05. Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario por hora.
 */

public class Main {
    public static void main(String[] args) {

        int salario_hora = 30;
        int horas_semanal = 38;
        int salario_semanal = salario_hora * horas_semanal;
        System.out.println("Salario semanal: " + salario_semanal);
    }
}