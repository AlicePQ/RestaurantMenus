import java.util.List;
import java.util.Arrays;

public class MenuGourmetFactory implements MenuFactory {
    public List<InitialDish> createInitialDishes() {
        return Arrays.asList(
            new GenericDish("Carpaccio de salmón"),
            new GenericDish("Bruschetta con tomate y albahaca"),
            new GenericDish("Sopa de champiñones")
        );
    }

    public List<MainDish> createMainDishes() {
        return Arrays.asList(
            new GenericDish("Filete mignon con salsa de vino tinto"),
            new GenericDish("Risotto de mariscos"),
            new GenericDish("Pato a la naranja")
        );
    }

    public List<Drink> createDrinks() {
        return Arrays.asList(
            new GenericDish("Vino tinto reserva"),
            new GenericDish("Champaña"),
            new GenericDish("Agua con gas")
        );
    }

    public List<Dessert> createDesserts() {
        return Arrays.asList(
            new GenericDish("Soufflé de chocolate"),
            new GenericDish("Crème brûlée"),
            new GenericDish("Tiramisú")
        );
    }
}
