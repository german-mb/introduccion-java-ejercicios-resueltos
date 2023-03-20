import java.util.Scanner;

/*
10.	Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo está compuesto por 5 estudiantes. Se pide llenar las notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la nota final del estudiante que se encuentra en la posición N (N se lee por teclado).
 */
public class GestionDeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float primer_trim[],
                segundo_trim[], tercer_trim[],
                nota, sum_1trim = 0, sum_2trim = 0,
                sum_3trim = 0, prom_est_n = 0;
        int est_pos;
        primer_trim = new float[4];
        segundo_trim = new float[4];
        tercer_trim = new float[4];
        System.out.println("Rango de notas 1 - 100");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota estudiante "
                    + (i + 1) + ", 1er Trim: ");
            nota = teclado.nextFloat();
            primer_trim[i] = nota;
            sum_1trim += nota;
            System.out.print("Nota estudiante "
                    + (i + 1) + ", 2do Trim: ");
            nota = teclado.nextFloat();
            segundo_trim[i] = nota;
            sum_2trim += nota;
            System.out.print("Nota estudiante "
                    + (i + 1) + ", 3er Trim: ");
            nota = teclado.nextFloat();
            tercer_trim[i] = nota;
            sum_3trim += nota;
        }
        System.out.print("Ingrese un estudiante entre 1 - 4: ");
        est_pos = teclado.nextInt();
        prom_est_n = (primer_trim[est_pos - 1]
                + segundo_trim[est_pos - 1]
                + tercer_trim[est_pos - 1]) / 3;
        System.out.println("Promedio notas 1er Trim: "
                + (sum_1trim / 4));
        System.out.println("Promedio notas 2do Trim: "
                + (sum_2trim / 4));
        System.out.println("Promedio notas 3er Trim: "
                + (sum_3trim / 4));
        System.out.println("Nota final Est. N: "
                + prom_est_n);
    }
}
