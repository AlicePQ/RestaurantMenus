public class GenericDish implements InitialDish, MainDish, Drink, Dessert {
    private String description;

    public GenericDish(String description) {
        this.description = description;
    }

    @Override
    public void add() {
        System.out.println(description);
    }

    public String getDescription() {
        return description;
    }
}
