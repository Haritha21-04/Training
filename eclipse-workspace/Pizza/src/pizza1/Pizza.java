package pizza1;

class Pizza {
    String type;
    String toppings;
    String name;
    float timeForPreparation;

    public Pizza(String type, String toppings, String name, float timeForPreparation) {
        if (!type.equals("veg") && !type.equals("non-veg")) {
            System.out.println("Invalid type");
            return;
        }
        this.type = type;
        this.toppings = toppings;
        this.name = name;
        this.timeForPreparation = timeForPreparation;
    }

    @Override
    public String toString() {
        return "Pizza details are: " + type + " " + name + " with " + toppings + " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

class ItalianPizza extends Pizza {
    public ItalianPizza(String type, String toppings, String name, float timeForPreparation) {
        super(type, toppings, name, timeForPreparation);
    }

    @Override
    public String toString() {
        return "Italian Pizza details are: " + type + " " + name + " with " + toppings + " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

class MexicanPizza extends Pizza {
    public MexicanPizza(String type, String toppings, String name, float timeForPreparation) {
        super(type, toppings, name, timeForPreparation);
    }

    @Override
    public String toString() {
        return "Mexican Pizza details are: " + type + " " + name + " with " + toppings + " toppings which takes " + timeForPreparation + " min for preparation.";
    }
}

