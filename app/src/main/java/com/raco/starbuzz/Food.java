package com.raco.starbuzz;

public class Food {
    private String name;
    private String description;
    private int imageResourceId;

    //foods is an array of Foods
    public static final Food[] foods = {
            new Food("Grain Salad", "A salad made of a mix of grains", R.drawable.b_grain_salad),
            new Food("Hamburger", "Delicious home made hamburger", R.drawable.b_hamburger),
            new Food("Mediterranean Salad", "Mediterranean style salad with dressing", R.drawable.b_mediterranean_salad)
    };

    //Each Food has a name, description, and an image resource
    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
