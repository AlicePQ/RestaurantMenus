import java.util.List;
import java.util.Arrays;

public class MenuVegetarianFactory implements MenuFactory {
    public List<InitialDish> createInitialDishes() {
        return Arrays.asList(
            new GenericDish("Ensalada fresca de quinoa"),
            new GenericDish("Sopa de lentejas"),
            new GenericDish("Croquetas de espinaca")
        );
    }

    public List<MainDish> createMainDishes() {
        return Arrays.asList(
            new GenericDish("Lasaña de berenjena"),
            new GenericDish("Hamburguesa de garbanzos"),
            new GenericDish("Arroz integral con vegetales")
        );
    }

    public List<Drink> createDrinks() {
        return Arrays.asList(
            new GenericDish("Jugo natural de mango"),
            new GenericDish("Té helado de frutos rojos"),
            new GenericDish("Agua mineral")
        );
    }

    public List<Dessert> createDesserts() {
        return Arrays.asList(
            new GenericDish("Tarta de manzana"),
            new GenericDish("Brownie vegano"),
            new GenericDish("Helado de frutas")
        );
    }
}
