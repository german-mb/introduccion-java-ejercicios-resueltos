public class Division {
    public static void main(String[] args) {
        try {
            System.out.println("La division es: " + dividir(4, 0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static double dividir(double a, double b) throws Exception {
        double result = 0;
        if (b != 0) {
            result = a / b;
        } else {
            throw new Exception("No se puede dividir por cero");
        }
        return result;
    }
}
