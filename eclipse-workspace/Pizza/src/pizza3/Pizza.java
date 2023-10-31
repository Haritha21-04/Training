	package pizza3;
	public abstract class Pizza {
	    private String type;
	    private String toppings;
	    private String name;
	    private float timeForPreparation;
	    private int costOfPizza;
	    private String size;

	    public Pizza(String type, String toppings, String name, float timeForPreparation, int costOfPizza, String size) {
	        // Validate type and size
	        if (!isValidType(type) || !isValidSize(size)) {
	            System.out.println("Invalid pizza type or size");
	            return;
	        }

	        this.setType(type);
	        this.setToppings(toppings);
	        this.setName(name);
	        this.setTimeForPreparation(timeForPreparation);
	        this.setCostOfPizza(costOfPizza);
	        this.setSize(size);
	    }

	    // Abstract method to calculate the cost of the pizza
	    public abstract int calculateCost();

	    private boolean isValidType(String type) {
	        return type.equals("Veg") || type.equals("Non-Veg");
	    }

	    private boolean isValidSize(String size) {
	        return size.equals("small") || size.equals("medium");
	    }

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getToppings() {
			return toppings;
		}

		public void setToppings(String toppings) {
			this.toppings = toppings;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getTimeForPreparation() {
			return timeForPreparation;
		}

		public void setTimeForPreparation(float timeForPreparation) {
			this.timeForPreparation = timeForPreparation;
		}

		public int getCostOfPizza() {
			return costOfPizza;
		}

		public void setCostOfPizza(int costOfPizza) {
			this.costOfPizza = costOfPizza;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}
	}
