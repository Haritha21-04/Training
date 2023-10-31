package pizza3;

public class ItalianPizza extends Pizza {
    public ItalianPizza(String type, String toppings, String name, float timeForPreparation, int costOfPizza, String size) {
        super(type, toppings, name, timeForPreparation, costOfPizza, size);
    }

    @Override
    public int calculateCost() {
        int baseCost = 0;
        if (getType().equals("Veg")) {
            if (getSize().equals("small")) {
                baseCost = 200;
            } else if (getSize().equals("medium")) {
                baseCost = 350;
            }
        } else if (getType().equals("Non-Veg")) {
            if (getSize().equals("small")) {
                baseCost = 270;
            } else if (getSize().equals("medium")) {
                baseCost = 420;
            }
        }

        // Add extra cost for toppings
        int toppingCost = 30;

        return baseCost + toppingCost;
    }

    @Override
    public String toString() {
        return "Pizza Details: \n" +
                "Type: " + getType() + "\n" +
                "Toppings: " + getToppings() + "\n" +
                "Name: " + getName() + "\n" +
                "Time for Preparation: " + getTimeForPreparation() + " minutes\n" +
                "Size: " + getSize() + "\n" +
                "Cost: $" + calculateCost();
    }
}
