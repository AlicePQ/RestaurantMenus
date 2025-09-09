import java.util.List;

interface MenuFactory {
    List<InitialDish> createInitialDishes();
    List<MainDish> createMainDishes();
    List<Drink> createDrinks();
    List<Dessert> createDesserts();
}
