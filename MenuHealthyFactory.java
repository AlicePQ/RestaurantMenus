import java.util.List;
import java.util.Arrays;

public class MenuHealthyFactory implements MenuFactory {
    public List<InitialDish> createInitialDishes() {
        return Arrays.asList(
            new GenericDish("Crema de verduras"),
            new GenericDish("Ensalada de aguacate"),
            new GenericDish("Gazpacho andaluz")
        );
    }

    public List<MainDish> createMainDishes() {
        return Arrays.asList(
            new GenericDish("Pechuga de pollo a la plancha con ensalada"),
            new GenericDish("Salmón al vapor con brócoli"),
            new GenericDish("Tortilla de claras con espinaca")
        );
    }

    public List<Drink> createDrinks() {
        return Arrays.asList(
            new GenericDish("Agua saborizada con limón"),
            new GenericDish("Jugo verde detox"),
            new GenericDish("Infusión de hierbas")
        );
    }

    public List<Dessert> createDesserts() {
        return Arrays.asList(
            new GenericDish("Yogur con frutos rojos"),
            new GenericDish("Gelatina sin azúcar"),
            new GenericDish("Ensalada de frutas")
        );
    }
}
