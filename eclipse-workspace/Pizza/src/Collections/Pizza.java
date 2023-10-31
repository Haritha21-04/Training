package Collections;


class Pizza {
    private String type;
    private String size;

    public Pizza(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Size: " + size;
    }
}

