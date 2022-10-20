import java.util.Scanner;

/*
15.	La pizzería Bella Rita ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los ingredientes para cada tipo de pizza aparecen a continuación.
•	Ingredientes vegetarianos: Pimiento y Tofu.
•	Ingredientes no vegetarianos: Pepperoni, Jamón y Salmón.
Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija. Solo se puede elegir un ingrediente además de la mozzarella y el tomate que están en todas las pizzas. Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes que contiene.

 */
public class Pizzeria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tipo, ingrediente;
        String texto = "";
        System.out.println("Bienvenido a la pizzeria Bella Rita." +
                "\nTipos de pizza" +
                "\n\t1- Vegetariana" +
                "\n\t2- No vegetariana");
        System.out.println("Introduzca el numero correspondiente al tipo de pizza que desea: ");
        tipo = teclado.nextInt();
        if (tipo == 1) {
            System.out.println("\"Ingredientes de pizzas vegetarianas" +
                    "\n\t1- Pimiento" +
                    "\n\t2- Tofu\n");
            System.out.println("Seleccione el ingrediente que desea: ");
            ingrediente = teclado.nextInt();
            System.out.print("Pizza vegetariana con mozzarella, tomate y ");
            if (ingrediente == 1) {
                System.out.println("pimiento.");
            } else {
                System.out.println("tofu.\n");
            }
        } else {
            System.out.println("Ingredientes de pizzas no vegetarianas" +
                    "\n\t1- Peperoni" +
                    "\n\t2- Jamon" +
                    "\n\t3- Salmon\n");
            System.out.println("Seleccione el ingrediente que desea: ");
            ingrediente = teclado.nextInt();
            System.out.print("Pizza no vegetarina con mozarrella, tomate y ");
            if (ingrediente == 1) {
                System.out.println("pepperoni.");
            } else if (ingrediente == 2) {
                System.out.println("jamon.");
            } else {
                System.out.println("salmon.\n");
            }
        }
    }
}
