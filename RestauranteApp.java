import java.util.*;

public class RestauranteApp {

    private static <T> T elegirOpcion(Scanner sc, List<T> opciones) {
        for (int i = 0; i < opciones.size(); i++) {
            GenericDish dish = (GenericDish) opciones.get(i);
            System.out.println((i + 1) + ". " + dish.getDescription());
        }
        System.out.print("Seleccione una opción: ");
        int choice = sc.nextInt();
        return opciones.get(choice - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Restaurante!");
        System.out.println("Seleccione el tipo de menú que desea:");
        System.out.println("1. Gourmet");
        System.out.println("2. Vegetariano");
        System.out.println("3. Saludable");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        MenuFactory factory = null;
        switch (opcion) {
            case 1: factory = new MenuGourmetFactory(); break;
            case 2: factory = new MenuVegetarianFactory(); break;
            case 3: factory = new MenuHealthyFactory(); break;
            default:
                System.out.println("Opción inválida. Se asigna menú Gourmet por defecto.");
                factory = new MenuGourmetFactory();
        }

        System.out.println("\nSeleccione su entrada:");
        InitialDish entrada = elegirOpcion(scanner, factory.createInitialDishes());

        System.out.println("\nSeleccione su plato principal:");
        MainDish plato = elegirOpcion(scanner, factory.createMainDishes());

        System.out.println("\nSeleccione su bebida:");
        Drink bebida = elegirOpcion(scanner, factory.createDrinks());

        System.out.println("\nSeleccione su postre:");
        Dessert postre = elegirOpcion(scanner, factory.createDesserts());

        System.out.println("\nSu pedido final incluye:");
        entrada.add();
        plato.add();
        bebida.add();
        postre.add();

        System.out.println("\n¡Gracias por su pedido!");
        scanner.close();
    }
}
