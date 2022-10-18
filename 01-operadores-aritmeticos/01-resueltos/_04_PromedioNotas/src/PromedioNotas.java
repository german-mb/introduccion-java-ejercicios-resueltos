import java.util.Scanner;

/*
4.	Crear un programa que calcule el promedio de tres calificaciones de un estudiante.
 */
public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese nota1, nota2 y nota3: ");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
    }
}
